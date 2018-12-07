package py.com.springcloud.demo.common.exception.handler;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpMediaTypeException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.NoHandlerFoundException;

import py.com.springcloud.demo.common.beans.Constants;
import py.com.springcloud.demo.common.beans.ErrorBody;
import py.com.springcloud.demo.common.exception.APIException;
import py.com.springcloud.demo.common.exception.APIExceptionType;
import py.com.springcloud.demo.common.exception.ApiClientFeignException;
import py.com.springcloud.demo.common.exception.ErrorCode;

@ControllerAdvice
public class HandlerException {

		private static Logger logger = Logger.getLogger(HandlerException.class);

		@ExceptionHandler(value = Throwable.class)
		public @ResponseBody ErrorBody handleGlobalException(HttpServletRequest request, HttpServletResponse response, Throwable e)
		{
			logger.error("Manejando error", e);
			request.setAttribute(Constants.ATTRIBUTE_EXCEPTION, e);
			ErrorBody eb = new ErrorBody();
			boolean statusSet = false;
			
			if (e instanceof APIException)
			{
				APIException ae = (APIException)e;
				eb.setCode(ae.getCode());
				eb.setMessage(ae.getMessage());
				eb.setType(ae.getType());
				// MissingServletRequestParameterException
			} else if (e instanceof MissingServletRequestParameterException) {
				MissingServletRequestParameterException msrpe = (MissingServletRequestParameterException)e;
				eb.setCode(ErrorCode.ERROR_MISSING_PARAMETER);
				eb.setMessage(String.format("Parametro [%s] de tipo [%s] no encontrado en el request", msrpe.getParameterName(), msrpe.getParameterType()));
				eb.setType(APIExceptionType.APPLICATION);
			} else if (e instanceof MethodArgumentNotValidException) {
				MethodArgumentNotValidException msrpe = (MethodArgumentNotValidException)e;
				eb.setCode(ErrorCode.ERROR_MISSING_PARAMETER);
				eb.setMessage(String.format("Los atributos del objeto [%s] no cumplen con las restricciones, [%s]",msrpe.getParameter().getParameterName() , msrpe.getMessage()));
				eb.setType(APIExceptionType.APPLICATION);
			}else if(e instanceof HttpMessageNotReadableException){
//				HttpMessageNotReadableException mnre = (HttpMessageNotReadableException)e;
				eb.setCode(ErrorCode.ERROR_MISSING_INVALID_BODY_PARAMETER);
				//eb.setMessage(String.format("Parameter [%s] of type [%s] is missing from request", mnre.getParameterName(), msrpe.getParameterType()));
				eb.setMessage("Parametro del body invalido o inexistente");
				eb.setType(APIExceptionType.APPLICATION);
			} else if (e instanceof MethodArgumentNotValidException){
				MethodArgumentNotValidException manve = (MethodArgumentNotValidException)e;
				eb.setCode(ErrorCode.ERROR_MISSING_PARAMETER);
				eb.setMessage(String.format("Parametro [%s] del tipo [%s] no suministrado en el requestBody", manve.getParameter().getParameterName(), manve.getParameter().getParameterType()));
				eb.setType(APIExceptionType.APPLICATION);
			} else if (e instanceof HttpRequestMethodNotSupportedException) {
				HttpRequestMethodNotSupportedException mnse = (HttpRequestMethodNotSupportedException)e;
				eb.setCode(ErrorCode.ERROR_HTTP_INVALID_METHOD);
				eb.setMessage(String.format("Metodo [%s] no es soportado para este servicio", mnse.getMethod()));
				eb.setType(APIExceptionType.INTERNAL);
				response.setStatus(HttpStatus.METHOD_NOT_ALLOWED.value());
				statusSet = true;
			} else if (e instanceof NoHandlerFoundException) {
				NoHandlerFoundException nhfe = (NoHandlerFoundException)e;
				eb.setCode(ErrorCode.ERROR_HTTP_INVALID_METHOD);
				eb.setMessage(String.format("handler no encontrado para url [%s] y metodo [%s]", nhfe.getRequestURL(), nhfe.getHttpMethod()));
				eb.setType(APIExceptionType.APPLICATION);
				response.setStatus(HttpStatus.NOT_FOUND.value());
				statusSet = true;
			} else if (e instanceof HttpMediaTypeException) {
//				HttpMediaTypeException mte = (HttpMediaTypeException)e;
				eb.setCode(ErrorCode.ERROR_UNEXPECTED_WEB);
				eb.setMessage("Unexpected WEB COMPONENT error");
				eb.setType(APIExceptionType.INTERNAL);
			} else if (e instanceof DataAccessException) {
//				DataAccessException dae = (DataAccessException)e;
				eb.setCode(ErrorCode.ERROR_UNEXPECTED_DB);
				eb.setMessage("Error DATABASE inesperado");
				eb.setType(APIExceptionType.DATABASE);
			} else if (e instanceof SQLException) {
//				SQLException se = (SQLException)e;
				eb.setCode(ErrorCode.ERROR_UNEXPECTED_DB);
				eb.setMessage("Error DATABASE inesperado");
				eb.setType(APIExceptionType.DATABASE);
			}else if (e instanceof ApiClientFeignException ){
				eb.setCode(((ApiClientFeignException) e).getApiException().getCode());
				eb.setMessage(((ApiClientFeignException) e).getApiException().getMessage());
				eb.setType(((ApiClientFeignException) e).getApiException().getType());
			} else {
				eb.setCode(ErrorCode.ERROR_UNEXPECTED);
				eb.setMessage("Unexpected server exception");
				eb.setType(APIExceptionType.INTERNAL);
			}
			
			if (!statusSet) {
				switch(eb.getType())
				{
				case APPLICATION:
					response.setStatus(HttpStatus.BAD_REQUEST.value());
					break;
				case SECURITY:
					response.setStatus(HttpStatus.UNAUTHORIZED.value());
					break;
				case DATABASE:
				case INTERNAL:
					response.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
					break;
				}
			}
			return eb;
		}
	
	
}

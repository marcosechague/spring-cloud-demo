package py.com.springcloud.demo.common.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import py.com.springcloud.demo.common.beans.Constants;
import py.com.springcloud.demo.common.exception.APIException;

@Component
public class DemoInterceptor extends HandlerInterceptorAdapter {
	
	private Logger logger = Logger.getLogger(DemoInterceptor.class);
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		logger.info("EXECUTAMOS EL PRE-HANDLER Y PROBAMOS SI ESTA CORRIENDO BIEN: " + request.getRequestURI());
		return true;
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
		String errorCode = null, errorMessage = null;
		Throwable tex = null;
		if (ex == null) {
			try {
				tex = (Throwable) request.getAttribute(Constants.ATTRIBUTE_EXCEPTION);
			} catch (Throwable t) {
				// ignore
			}
		} else {
			tex = ex;
		}
		if (tex != null) {
			if (tex instanceof APIException) {
				APIException aex = (APIException)tex;
				errorCode = aex.getCode();
				errorMessage = aex.getMessage();
				logger.error("Este es el error: "+errorCode+" : "+errorMessage);
			} else {
				errorCode = "En una constante de errores comunes";
				errorMessage = tex.getMessage();
			}
		}
	}
}

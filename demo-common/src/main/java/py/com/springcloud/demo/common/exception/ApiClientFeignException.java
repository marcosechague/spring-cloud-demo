package py.com.springcloud.demo.common.exception;

import java.io.IOException;

import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import feign.FeignException;

public class ApiClientFeignException extends Exception{

	private static final Logger logger = Logger.getLogger(ApiClientFeignException.class);
	
	private APIException apiException;
	
	public ApiClientFeignException(FeignException fe) {
		super(fe.getMessage(), fe.getCause());
		this.apiException = getApiExceptionFromMesssage(fe.getMessage());
	}
	
	private static final long serialVersionUID = 1L;

	public APIException getApiException() {
		return apiException;
	}

	public void setApiException(APIException apiException) {
		this.apiException = apiException;
	}
	
	private APIException getApiExceptionFromMesssage(String message){
		logger.info("Trying to retrieve api exception from feign message");
		String apiExceptionJson = "";
		try{
			apiExceptionJson = message.substring(message.indexOf("{"), message.indexOf("}")+1);
			ObjectMapper mapper = new ObjectMapper();
			APIException aeRef = mapper.readValue(apiExceptionJson, APIException.class);
			JsonNode jsonNodeRoot = mapper.readTree(apiExceptionJson);
			JsonNode jsonNodeMessage = jsonNodeRoot.get("message");
			return new APIException(aeRef.getType(), aeRef.getCode(),jsonNodeMessage!=null?jsonNodeMessage.textValue():null, aeRef.getCause());
			
		}catch(IOException re){
			logger.warn("Cant deserialize the json "+apiExceptionJson);
		}catch(RuntimeException re){
			logger.info("the message doesn't containt ApiException");
		}
		return null;
		
	}
	
	
}

package py.com.springcloud.demo.common.exception;

public class APIException extends Exception{

	private static final long serialVersionUID = 11234534675550856L;
	
	private APIExceptionType type;
	private String code;
	
	public APIException(){
		super();
	}
	
//	public APIException(APIExceptionType type, String code, String message,Boolean useApiMessage, Throwable cause)
//	{
//		super(message, cause);
//		setType(type);
//		setCode(code);
//		setUseApiMessage(useApiMessage);
//	}
	
	public APIException(APIExceptionType type, String code, String message, Throwable cause)
	{
		super(message, cause);
		setType(type);
		setCode(code);
	}
	
	public APIException(APIExceptionType type, String code, String message)
	{
		this(type, code, message, null);
	}
	
	
	public APIException(APIExceptionType type, String code)
	{
		this(type, code, null, null);
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public APIExceptionType getType() {
		return type;
	}
	public void setType(APIExceptionType type) {
		this.type = type;
	}

	public String getDetailMessage() {
		return super.getMessage();
	}
	
}

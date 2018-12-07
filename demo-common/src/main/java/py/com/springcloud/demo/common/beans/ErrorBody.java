package py.com.springcloud.demo.common.beans;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import py.com.springcloud.demo.common.exception.APIExceptionType;

@XmlRootElement(name="error")
@JsonIgnoreProperties(ignoreUnknown=true)
public class ErrorBody {

	private String code;
	private String message;
	private APIExceptionType type;

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public APIExceptionType getType() {
		return type;
	}
	public void setType(APIExceptionType type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "ErrorBody [code=" + code + ", message=" + message + ", type=" + type.toString() + ", useApiMessage="+ "]";
	}
}

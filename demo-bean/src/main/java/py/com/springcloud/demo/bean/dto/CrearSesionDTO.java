package py.com.springcloud.demo.bean.dto;

import org.hibernate.validator.constraints.NotBlank;

public class CrearSesionDTO {

	@NotBlank
	private String clienteType;
	
	@NotBlank
	private String clientVersion;
	
	@NotBlank
	private String user;
	
	@NotBlank
	private String password;

	@NotBlank
	private String tstamp;
	
	@NotBlank
	private String ssign;

	public String getClienteType() {
		return clienteType;
	}

	public void setClienteType(String clienteType) {
		this.clienteType = clienteType;
	}

	public String getClientVersion() {
		return clientVersion;
	}

	public void setClientVersion(String clientVersion) {
		this.clientVersion = clientVersion;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTstamp() {
		return tstamp;
	}

	public void setTstamp(String tstamp) {
		this.tstamp = tstamp;
	}

	public String getSsign() {
		return ssign;
	}

	public void setSsign(String ssign) {
		this.ssign = ssign;
	}

	@Override
	public String toString() {
		return "CrearSesionDTO [clienteType=" + clienteType
				+ ", clientVersion=" + clientVersion + ", user=" + user
				+ ", password= ****** , tstamp=" + tstamp + ", ssign="
				+ ssign + "]";
	}

}

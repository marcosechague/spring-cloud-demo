package py.com.springcloud.demo.bean.beans;

import java.util.Map;

import py.com.springcloud.demo.bean.enums.Estado;

public class ClientVersion {

	private String clientType;
	private String clientVersion;
	private String sharedSecret;
	private Estado estado;
	private Map<String, Object> infoAdicional;
	
	public String getClientType() {
		return clientType;
	}
	public void setClientType(String clientType) {
		this.clientType = clientType;
	}
	public String getClientVersion() {
		return clientVersion;
	}
	public void setClientVersion(String clientVersion) {
		this.clientVersion = clientVersion;
	}
	public String getSharedSecret() {
		return sharedSecret;
	}
	public void setSharedSecret(String sharedSecret) {
		this.sharedSecret = sharedSecret;
	}
	public Map<String, Object> getInfoAdicional() {
		return infoAdicional;
	}
	public void setInfoAdicional(Map<String, Object> infoAdicional) {
		this.infoAdicional = infoAdicional;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	@Override
	public String toString() {
		return "ClientVersion [clientType=" + clientType + ", clientVersion="
				+ clientVersion + ", sharedSecret=" + sharedSecret
				+ ", estado=" + estado + ", infoAdicional=" + infoAdicional
				+ "]";
	}
	
}

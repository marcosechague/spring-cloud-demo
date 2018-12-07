package py.com.springcloud.demo.bean.beans;

import java.util.Date;
import java.util.List;
import java.util.Map;

import py.com.springcloud.demo.bean.enums.EstadoSesion;

public class Sesion {

	public static final String CODIGO_USUARIO_IA_KEY = "USUARIO_ID";
	
	private Long sessionId;
	private String accessToken;
	private String type;
	private EstadoSesion status;
	private Date created;
	private Date receivedTimeStamp;
	private Date expiration;
	private Date invalidado;
	private String usuarioTipo;
	private String usuarioValue;
	private Integer usuarioId;
	private List<String> permisos;
	private Usuario usuario;
	private Boolean forceChangePass;
	private Map<String, Object> infoAdicional;
	public Long getSessionId() {
		return sessionId;
	}
	public void setSessionId(Long sessionId) {
		this.sessionId = sessionId;
	}
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public EstadoSesion getStatus() {
		return status;
	}
	public void setStatus(EstadoSesion status) {
		this.status = status;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getReceivedTimeStamp() {
		return receivedTimeStamp;
	}
	public void setReceivedTimeStamp(Date receivedTimeStamp) {
		this.receivedTimeStamp = receivedTimeStamp;
	}
	public Date getExpiration() {
		return expiration;
	}
	public void setExpiration(Date expiration) {
		this.expiration = expiration;
	}
	public Date getInvalidado() {
		return invalidado;
	}
	public void setInvalidado(Date invalidado) {
		this.invalidado = invalidado;
	}
	public String getUsuarioTipo() {
		return usuarioTipo;
	}
	public void setUsuarioTipo(String usuarioTipo) {
		this.usuarioTipo = usuarioTipo;
	}
	public String getUsuarioValue() {
		return usuarioValue;
	}
	public void setUsuarioValue(String usuarioValue) {
		this.usuarioValue = usuarioValue;
	}
	public Integer getUsuarioId() {
		return usuarioId;
	}
	public void setUsuarioId(Integer usuarioId) {
		this.usuarioId = usuarioId;
	}
	public List<String> getPermisos() {
		return permisos;
	}
	public void setPermisos(List<String> permisos) {
		this.permisos = permisos;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Boolean getForceChangePass() {
		return forceChangePass;
	}
	public void setForceChangePass(Boolean forceChangePass) {
		this.forceChangePass = forceChangePass;
	}
	public Map<String, Object> getInfoAdicional() {
		return infoAdicional;
	}
	public void setInfoAdicional(Map<String, Object> infoAdicional) {
		this.infoAdicional = infoAdicional;
	}

	@Override
	public String toString() {
		return "Sesion [sessionId=" + sessionId + ", accessToken="
				+ accessToken + ", type=" + type + ", status=" + status
				+ ", created=" + created + ", receivedTimeStamp="
				+ receivedTimeStamp + ", expiration=" + expiration
				+ ", invalidado=" + invalidado + ", usuarioTipo=" + usuarioTipo
				+ ", usuarioValue=" + usuarioValue + ", usuarioId=" + usuarioId
				+ ", permisos=" + permisos + ", usuario=" + usuario
				+ ", forceChangePass=" + forceChangePass + ", infoAdicional="
				+ infoAdicional + "]";
	}
	
}

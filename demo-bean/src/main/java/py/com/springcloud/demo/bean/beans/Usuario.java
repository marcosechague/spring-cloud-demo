package py.com.springcloud.demo.bean.beans;

import java.util.Date;
import java.util.Map;

import py.com.springcloud.demo.bean.enums.Estado;
import py.com.springcloud.demo.bean.enums.TipoDocumento;

public class Usuario {

	private Integer idUsuario;
	private String login;
	private String nombre;
	private String apellido;
	private Integer intentosFallidos;
	private Estado estado;
	private String email;
	private String celular;
	private TipoDocumento tipoDocumento;
	private String documento;
	private Date ultimoAcceso;
	private Date fechaCreacion;
	private Rol rol;
	private Cliente cliente;
	private Map<String, Object> infoAdicional;
	
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getIntentosFallidos() {
		return intentosFallidos;
	}
	public void setIntentosFallidos(Integer intentosFallidos) {
		this.intentosFallidos = intentosFallidos;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public Date getUltimoAcceso() {
		return ultimoAcceso;
	}
	public void setUltimoAcceso(Date ultimoAcceso) {
		this.ultimoAcceso = ultimoAcceso;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Rol getRol() {
		return rol;
	}
	public void setRol(Rol rol) {
		this.rol = rol;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Map<String, Object> getInfoAdicional() {
		return infoAdicional;
	}
	public void setInfoAdicional(Map<String, Object> infoAdicional) {
		this.infoAdicional = infoAdicional;
	}
	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", login=" + login
				+ ", nombre=" + nombre + ", apellido=" + apellido
				+ ", intentosFallidos=" + intentosFallidos + ", estado="
				+ estado + ", email=" + email + ", celular=" + celular
				+ ", tipoDocumento=" + tipoDocumento + ", documento="
				+ documento + ", ultimoAcceso=" + ultimoAcceso
				+ ", fechaCreacion=" + fechaCreacion + ", rol=" + rol
				+ ", cliente=" + cliente + ", infoAdicional=" + infoAdicional
				+ "]";
	}
}

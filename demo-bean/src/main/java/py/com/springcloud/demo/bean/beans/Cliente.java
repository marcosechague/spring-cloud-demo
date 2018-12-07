package py.com.springcloud.demo.bean.beans;

import java.util.Date;

import py.com.springcloud.demo.bean.enums.Estado;

public class Cliente {
	
	private Integer codigo;
	private String nombre;
	private String apellido;
	private String direccion;
	private String documento;
	private String ruc;
	private String email;
	private String telefono;
	private Date fechaNacimiento;
	private String infoAdicional;
	private Ciudad ciudad;
	private Estado estado;
	private Date fechaRegistro;
	
	public Cliente() {
		super();
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getInfoAdicional() {
		return infoAdicional;
	}
	public void setInfoAdicional(String infoAdicional) {
		this.infoAdicional = infoAdicional;
	}
	public Ciudad getCiudad() {
		return ciudad;
	}
	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	
	
	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", direccion=" + direccion
				+ ", documento=" + documento + ", ruc=" + ruc + ", email="
				+ email + ", telefono=" + telefono + ", fechaNacimiento="
				+ fechaNacimiento + ", infoAdicional=" + infoAdicional
				+ ", ciudad=" + ciudad + ", estado=" + estado
				+ ", fechaRegistro=" + fechaRegistro + "]";
	}
	

}

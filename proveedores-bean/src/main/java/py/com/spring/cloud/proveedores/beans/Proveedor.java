package py.com.spring.cloud.proveedores.beans;

import java.util.Date;

import py.com.springcloud.demo.bean.enums.Estado;

public class Proveedor {

	private Integer id;
	private String descripcion;
	private String ruc;
	private String email;
	private String telefono;
	private String direccion;
	private Estado estado;
	private Date fechaAlta;	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
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
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Date getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	@Override
	public String toString() {
		return "Proveedor [id=" + id + ", descripcion=" + descripcion
				+ ", ruc=" + ruc + ", email=" + email + ", telefono="
				+ telefono + ", direccion=" + direccion + ", estado=" + estado
				+ ", fechaAlta=" + fechaAlta + "]";
	}
	
	
	
	
}

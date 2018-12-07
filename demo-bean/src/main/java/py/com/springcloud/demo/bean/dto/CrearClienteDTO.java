package py.com.springcloud.demo.bean.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

public class CrearClienteDTO {

	@NotNull
	private String nombres;
	@NotNull
	private String apellidos;
	private String direccion;
	private String documento;
	private String ruc;
	private String email;
	private String telefono;
	private String fechaNacimiento;
	private Integer idCiudad;
	private String infoAdicional;
	
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
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
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Integer getIdCiudad() {
		return idCiudad;
	}
	public void setIdCiudad(Integer idCiudad) {
		this.idCiudad = idCiudad;
	}
	public String getInfoAdicional() {
		return infoAdicional;
	}
	public void setInfoAdicional(String infoAdicional) {
		this.infoAdicional = infoAdicional;
	}
	@Override
	public String toString() {
		return "CrearClienteDTO [nombres=" + nombres + ", apellidos="
				+ apellidos + ", direccion=" + direccion + ", documento="
				+ documento + ", ruc=" + ruc + ", email=" + email
				+ ", telefono=" + telefono + ", fechaNacimiento="
				+ fechaNacimiento + ", idCiudad=" + idCiudad
				+ ", infoAdicional=" + infoAdicional + "]";
	}
	
}

package py.com.springcloud.demo.bean.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import py.com.springcloud.demo.bean.enums.TipoDocumento;

import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

@ApiModel
public class UsuarioCreacionDTO {

	@NotBlank
	@ApiModelProperty(value="Login de usuario que utilizara para iniciar sesión, el campo es obligatorio",required=true)
	private String login;
	
	@NotBlank
	@ApiModelProperty(required=true)
	private String password;
	
	@NotBlank
	@ApiModelProperty(value="Nombre",required=true)
	private String nombre;
	
	@NotBlank
	@ApiModelProperty(value="Apellido",required=true)
	private String apellido;
	
	private String celular;
	
	private String email;
	
	@NotNull
	@ApiModelProperty(value="Tipo de documento",required=true)
	private TipoDocumento tipoDocumento;
	
	@NotBlank
	@ApiModelProperty(value="Numero de documento",required=true)
	private String documento;
	
	private Date fechaNacimiento;

	@ApiModelProperty(value="id de cliente, si se encuentra registrado como cliente.")
	private Integer idCliente;
	
	@ApiModelProperty(value="id del rol del usuario.")
	private Integer idRol;
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public Integer getIdRol() {
		return idRol;
	}

	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	@Override
	public String toString() {
		return "UsuarioCreacionDTO [login=" + login + ", password=****"
				+", nombre=" + nombre + ", apellido=" + apellido
				+ ", celular=" + celular + ", email=" + email
				+ ", tipoDocumento=" + tipoDocumento + ", documento="
				+ documento + ", fechaNacimiento=" + fechaNacimiento
				+ ", idRol=" + idRol+ ", idCliente=" + idCliente + "]";
	}

	
}

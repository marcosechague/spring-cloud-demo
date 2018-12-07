package py.com.springcloud.demo.bean.dto;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import py.com.springcloud.demo.bean.beans.Rol;
import py.com.springcloud.demo.bean.enums.Estado;

public class RolActualizacionDTO {

	@NotBlank
	@ApiModelProperty(value="Codigo del rol",required=true)
	private String codigo;
	
	private String descripcion;

	@NotNull
	@ApiModelProperty(required=true)
	private Estado estado;
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public static Rol getRolFromRolActualizacion(RolActualizacionDTO rolActualizacion ){
		Rol rol = new Rol();
		
		rol.setCodigo(rolActualizacion.getCodigo());
		rol.setDescripcion(rolActualizacion.getDescripcion());
		rol.setEstado(rolActualizacion.getEstado());
		
		return rol;
		
	}

	@Override
	public String toString() {
		return "RolActualizacionDTO [codigo=" + codigo + ", descripcion="
				+ descripcion + ", estado=" + estado + "]";
	}
	
}

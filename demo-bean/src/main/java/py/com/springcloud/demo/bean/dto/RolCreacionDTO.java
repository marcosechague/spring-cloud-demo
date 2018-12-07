package py.com.springcloud.demo.bean.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import py.com.springcloud.demo.bean.beans.Accion;

import java.util.List;

import org.hibernate.validator.constraints.NotBlank;

@ApiModel
public class RolCreacionDTO {

	@NotBlank
	@ApiModelProperty(value="Codigo del rol, el campo es obligatorio",required=true)
	private String codigo;
	
	private String descripcion;
	
	private List<Accion> acciones;

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
	
	public List<Accion> getAcciones() {
		return acciones;
	}

	public void setAcciones(List<Accion> acciones) {
		this.acciones = acciones;
	}

	@Override
	public String toString() {
		return "RolCreacionDTO [codigo=" + codigo + ", descripcion="
				+ descripcion + ", acciones=" + acciones + "]";
	}
	
}

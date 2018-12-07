/**
 * 
 */
package py.com.springcloud.demo.bean.beans;

import java.util.List;

import py.com.springcloud.demo.bean.enums.Estado;

/**
 * @author marcos
 *
 */
public class Rol {

	private Integer id;
	private String codigo;
	private String descripcion;
	private Estado estado;
	private List<Accion> acciones; 
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
	public List<Accion> getAcciones() {
		return acciones;
	}
	public void setAcciones(List<Accion> acciones) {
		this.acciones = acciones;
	}
	
	@Override
	public String toString() {
		return "Rol [id=" + id + ", codigo=" + codigo + ", descripcion="
				+ descripcion + ", estado=" + estado + ", acciones=" + acciones
				+ "]";
	}

}

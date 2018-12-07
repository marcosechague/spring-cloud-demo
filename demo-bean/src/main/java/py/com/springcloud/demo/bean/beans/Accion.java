/**
 * 
 */
package py.com.springcloud.demo.bean.beans;

import py.com.springcloud.demo.bean.enums.Estado;

/**
 * @author marcos
 *
 */
public class Accion {

	private Integer id;
	private String codigo;
	private String descripcion;
	private Estado estado;
	
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
	
	@Override
	public String toString() {
		return "Accion [id=" + id + ", codigo=" + codigo + ", descripcion="
				+ descripcion + ", estado=" + estado + "]";
	}
	
}

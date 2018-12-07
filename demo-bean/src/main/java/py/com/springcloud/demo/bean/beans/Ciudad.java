package py.com.springcloud.demo.bean.beans;

import py.com.springcloud.demo.bean.enums.Estado;

public class Ciudad {
	private Integer codigo;
	private String descripcion;
	private Estado estado;
	
	public Ciudad() {
		super();
	}
	public Ciudad(Integer codigo, String descripcion) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
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
		return "Ciudad [codigo=" + codigo + ", descripcion=" + descripcion
				+ ", estado=" + estado + "]";
	}
	
}

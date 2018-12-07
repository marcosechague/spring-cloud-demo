package py.com.spring.cloud.productos.beans;

import java.math.BigDecimal;

import py.com.spring.cloud.productos.enums.TipoProducto;
import py.com.springcloud.demo.bean.enums.Estado;

public class Producto {
	
	private Integer id;
	private String descripcion;
	private BigDecimal precio;
	private TipoProducto tipo;
	private String codigo;
	private Estado estado;
	
	public Producto() {
		super();
	}
	
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
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	public TipoProducto getTipo() {
		return tipo;
	}
	public void setTipo(TipoProducto tipo) {
		this.tipo = tipo;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", descripcion=" + descripcion
				+ ", precio=" + precio + ", tipo=" + tipo + ", codigo="
				+ codigo + ", estado=" + estado + "]";
	}

}

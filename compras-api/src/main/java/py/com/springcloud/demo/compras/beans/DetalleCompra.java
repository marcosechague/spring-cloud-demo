package py.com.springcloud.demo.compras.beans;

import java.math.BigDecimal;

import py.com.spring.cloud.productos.beans.Producto;

public class DetalleCompra {

	private Integer idDetalleCompra;
	private Producto producto;
	private Integer cantidad;
	private BigDecimal montoItem;
	
	public Integer getIdDetalleCompra() {
		return idDetalleCompra;
	}
	public void setIdDetalleCompra(Integer idDetalleCompra) {
		this.idDetalleCompra = idDetalleCompra;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public BigDecimal getMontoItem() {
		return montoItem;
	}
	public void setMontoItem(BigDecimal montoItem) {
		this.montoItem = montoItem;
	}
	
	
	
}

package py.com.springcloud.demo.compras.beans;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import py.com.spring.cloud.proveedores.beans.Proveedor;
import py.com.springcloud.demo.bean.beans.Usuario;
import py.com.springcloud.demo.bean.enums.Estado;

public class Compra {
	
	private Integer idCompra;
	private String nroFactura;
	private BigDecimal monto;
	private Date fechaCompra;
	private Estado estado;
	private Proveedor proveedor;
	private List<DetalleCompra> detalleCompra;
	private Usuario usuario;
	
	public Integer getIdCompra() {
		return idCompra;
	}
	public void setIdCompra(Integer idCompra) {
		this.idCompra = idCompra;
	}
	public String getNroFactura() {
		return nroFactura;
	}
	public void setNroFactura(String nroFactura) {
		this.nroFactura = nroFactura;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	public Date getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}	
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public Proveedor getProveedor() {
		return proveedor;
	}
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	public List<DetalleCompra> getDetalleCompra() {
		return detalleCompra;
	}
	public void setDetalleCompra(List<DetalleCompra> detalleCompra) {
		this.detalleCompra = detalleCompra;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	@Override
	public String toString() {
		return "Compra [idCompra=" + idCompra + ", nroFactura=" + nroFactura
				+ ", monto=" + monto + ", fechaCompra=" + fechaCompra
				+ ", proveedor=" + proveedor + ", detalleCompra="
				+ detalleCompra + ", usuario=" + usuario + "]";
	}
	
}
	
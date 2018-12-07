package py.com.springcloud.demo.compras.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

import py.com.spring.cloud.proveedores.beans.Proveedor;
import py.com.springcloud.demo.compras.beans.DetalleCompra;

public class RegistroCompraDTO{
	
	@NotBlank
	private String nroFactura;
	@NotNull
	private BigDecimal monto;
	
	private Date fechaCompra;
	
	private Proveedor proveedor;

	@NotNull
	private List<DetalleCompra> detalleCompra;
	
	
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

	@Override
	public String toString() {
		return "Compra [nroFactura=" + nroFactura + ", monto=" + monto
				+ ", fechaCompra=" + fechaCompra + ", proveedor=" + proveedor
				+ ", detalleCompra=" + detalleCompra + "]";
	}
	
}
	
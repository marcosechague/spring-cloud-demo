package py.com.springcloud.demo.compras.constants;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import py.com.spring.cloud.productos.beans.Producto;
import py.com.spring.cloud.proveedores.beans.Proveedor;
import py.com.springcloud.demo.bean.enums.Estado;
import py.com.springcloud.demo.compras.beans.Compra;
import py.com.springcloud.demo.compras.beans.DetalleCompra;

public class InMemory {
	
	public static final AtomicInteger ID_COMPRA =  new AtomicInteger(0);
	public static final List<Compra> COMPRAS =  new ArrayList<>();
	
	
	
	static{
		Compra c = new Compra();
		
		c.setEstado(Estado.ACTIVO);
		c.setFechaCompra(new Date());
		c.setIdCompra(ID_COMPRA.incrementAndGet());
		c.setMonto(new BigDecimal("500000"));
		c.setNroFactura("800341002-5");
		Proveedor prov = new Proveedor();
		prov.setId(1);
		c.setProveedor(prov);
		
		List<DetalleCompra> det = new ArrayList<DetalleCompra>();
		DetalleCompra d = new DetalleCompra();
		d.setCantidad(1);
		d.setMontoItem(new BigDecimal("200000"));
		Producto p = new Producto();
		p.setId(1);
		d.setProducto(p);
		d = new DetalleCompra();
		d.setCantidad(2);
		d.setMontoItem(new BigDecimal("150000"));
		p = new Producto();
		p.setId(2);
		d.setProducto(p);
		det.add(d);
		c.setDetalleCompra(det);
		
		COMPRAS.add(c);
		
		c = new Compra();
		
		c.setEstado(Estado.ACTIVO);
		c.setFechaCompra(new Date());
		c.setIdCompra(ID_COMPRA.incrementAndGet());
		c.setMonto(new BigDecimal("700000"));
		c.setNroFactura("8005212-5");
		prov = new Proveedor();
		prov.setId(1);
		c.setProveedor(prov);
		 det = new ArrayList<DetalleCompra>();
		d = new DetalleCompra();
		d.setCantidad(20);
		d.setMontoItem(new BigDecimal("20000"));
		p = new Producto();
		p.setId(2);
		d.setProducto(p);
		d = new DetalleCompra();
		d.setCantidad(12);
		d.setMontoItem(new BigDecimal("5000"));
		p = new Producto();
		p.setId(3);
		d.setProducto(p);
		det.add(d);
		c.setDetalleCompra(det);
		
		COMPRAS.add(c);
		
		
		
	}
}

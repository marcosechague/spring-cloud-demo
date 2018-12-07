package py.com.springcloud.demo.productos.constants;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import py.com.spring.cloud.productos.beans.Producto;
import py.com.spring.cloud.productos.enums.TipoProducto;
import py.com.springcloud.demo.bean.enums.Estado;




public class InMemory {

	public static final AtomicInteger ID_PRODICTO = new AtomicInteger(0);
	public static final List<Producto> PRODUCTOS = new ArrayList<>();
	
	static {
		Producto p = new Producto();
		p.setCodigo("1231515");
		p.setDescripcion("PILSEN'i");
		p.setId(1);
		p.setEstado(Estado.ACTIVO);
		p.setPrecio(new BigDecimal("5000"));
		p.setTipo(TipoProducto.UNIDAD);
		PRODUCTOS.add(p);// productoService.buscarProductos(palabraClave, estadoProducto);
		p = new Producto();
		p.setCodigo("123123423432");
		p.setDescripcion("BRAMA'i");
		p.setId(ID_PRODICTO.incrementAndGet());
		p.setEstado(Estado.ACTIVO);
		p.setPrecio(new BigDecimal("13000"));
		p.setTipo(TipoProducto.UNIDAD);
		PRODUCTOS.add(p);
		p = new Producto();
		p.setCodigo("23432434");
		p.setDescripcion("CORONA'i");
		p.setId(ID_PRODICTO.incrementAndGet());
		p.setEstado(Estado.ACTIVO);
		p.setPrecio(new BigDecimal("15000"));
		p.setTipo(TipoProducto.UNIDAD);
		PRODUCTOS.add(p);
	}
}

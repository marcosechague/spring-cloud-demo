package py.com.springcloud.demo.proveedores.constants;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import py.com.spring.cloud.proveedores.beans.Proveedor;
import py.com.springcloud.demo.bean.enums.Estado;

public class InMemory {

	public static final AtomicInteger ID_PROVEEDOR = new AtomicInteger(0);
	public static final List<Proveedor> PROVEEDORES= new ArrayList<>();
	
	static {
		
		Proveedor p = new Proveedor();
		p.setDescripcion("Proveedor 1");
		p.setId(ID_PROVEEDOR.incrementAndGet());
		p.setDireccion("Mcl lopez 234");
		p.setEmail("prov@gmail.com");
		p.setEstado(Estado.ACTIVO);
		p.setFechaAlta(new Date());
		p.setRuc("800518151-5");
		p.setTelefono("0984554855");
		
		PROVEEDORES.add(p);
		
		p = new Proveedor();
		p.setDescripcion("Proveedor 2");
		p.setId(ID_PROVEEDOR.incrementAndGet());
		p.setDireccion("Eusebio ayala 234");
		p.setEmail("prov@gmail.com");
		p.setEstado(Estado.ACTIVO);
		p.setFechaAlta(new Date());
		p.setRuc("90025111-5");
		p.setTelefono("0985447484");
		
		PROVEEDORES.add(p);
		
		p = new Proveedor();
		p.setDescripcion("Proveedor 3");
		p.setId(ID_PROVEEDOR.incrementAndGet());
		p.setDireccion("Colon 1585");
		p.setEmail("prov@gmail.com");
		p.setEstado(Estado.ACTIVO);
		p.setFechaAlta(new Date());
		p.setRuc("800002154-0");
		p.setTelefono("021458884");
		
		PROVEEDORES.add(p);
		
	}
	
}

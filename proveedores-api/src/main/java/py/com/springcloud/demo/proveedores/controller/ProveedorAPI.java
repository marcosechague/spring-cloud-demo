package py.com.springcloud.demo.proveedores.controller;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import py.com.spring.cloud.proveedores.beans.Proveedor;
import py.com.springcloud.demo.bean.enums.Estado;
import py.com.springcloud.demo.common.anotaciones.SecurityControl;
import py.com.springcloud.demo.common.exception.APIException;
import py.com.springcloud.demo.proveedores.constants.InMemory;

@RestController
public class ProveedorAPI {
	
	private static final Logger logger = Logger.getLogger(ProveedorAPI.class);
	
	@ApiOperation(value="Crea un nuevo proveedor", notes="Registra un nuevo proveedor", response=Proveedor.class)
	@RequestMapping(value="proveedores",method=RequestMethod.POST)
	public Proveedor registrarProveedor(
			@ApiParam(value="Nombre/razón social del proveedor", required=true, name="descripcion")
			@RequestParam(value="descripcion",required=true) String descripcion,
			
			@ApiParam(value="Ruc del proveedor", required=true, name="ruc")
			@RequestParam(value="ruc",required=true) String ruc,
			
			@ApiParam(value="Email del proveedor", required=false, name="email")
			@RequestParam(value="email",required=false) String email,
			
			@ApiParam(value="Telefono del proveedor", required=false, name="telefono")
			@RequestParam(value="telefono",required=false) String telefono,
			
			@ApiParam(value="Direccion del proveedor", required=false, name="direccion")
			@RequestParam(value="direccion",required=false) String direccion
			) throws APIException{
			
			logger.info("Llamada al servicio de registrar proveedor");
			
			Proveedor proveedorRegistrado = new Proveedor();
			proveedorRegistrado.setId(InMemory.ID_PROVEEDOR.incrementAndGet());
			proveedorRegistrado.setDescripcion(descripcion);
			proveedorRegistrado.setDireccion(direccion);
			proveedorRegistrado.setEmail(email);
			proveedorRegistrado.setEstado(Estado.ACTIVO);
			proveedorRegistrado.setFechaAlta(new Date());
			proveedorRegistrado.setRuc(ruc);
			proveedorRegistrado.setTelefono(telefono);
			
			logger.info("Proveedor registrado. Retornamos el proveedor registrado");
			return proveedorRegistrado;
		
	}
	
	@ApiOperation(value="Actualizar un proveedor", notes="Recibe un id de proveedor y retorna el proveedor correspondiente.", response=Proveedor.class)
	@RequestMapping (value="proveedores", method=RequestMethod.PUT)
	public Proveedor actualizarProveedor(
			@ApiParam(value="Nombre/razón social del proveedor", required=true, name="descripcion")
			@RequestParam(value="descripcion",required=true) String descripcion,
			
			@ApiParam(value="Ruc del proveedor", required=true, name="ruc")
			@RequestParam(value="ruc",required=true) String ruc,
			
			@ApiParam(value="Email del proveedor", required=false, name="email")
			@RequestParam(value="email",required=false) String email,
			
			@ApiParam(value="Telefono del proveedor", required=false, name="telefono")
			@RequestParam(value="telefono",required=false) String telefono,
			
			@ApiParam(value="Direccion del proveedor", required=false, name="direccion")
			@RequestParam(value="direccion",required=false) String direccion,
			
			@ApiParam(value="Estado del proveedor del proveedor. Puede ser ACTIVO/INACTIVO", required=false, name="estado")
			@RequestParam(value="estado",required=false) Estado estado,
			
			@ApiParam(value="Identificador de proveedor", required=true, name="id")
			@RequestParam(value="id",required=true) Integer idProveedor 
			)  throws APIException{
		
		logger.info("Llamada al servicio para actualizar datos del proveedor");
		Proveedor proveedor = null;//
		logger.info("Retornamos el proveedor actualizado");
		return proveedor;
	}
	
	@ApiOperation(value="Obtiene un proveedor", notes="Recibe un id de proveedor y retorna el proveedor correspondiente.", response=Proveedor.class)
	@RequestMapping (value="proveedores/{id-proveedor}", method=RequestMethod.GET)
	public Proveedor obtenerProveedorPorId(
		@ApiParam(value="Identificador del proveedor", required=true, name="id-proveedor")
		@PathVariable(value="id-proveedor", required=true) Integer idProveedor) throws APIException{
		logger.info("Llamada al servicio de obtener proveedor por id");
		Proveedor proveedor =  InMemory.PROVEEDORES.stream().filter(p->p.getId().equals(idProveedor)).findFirst().orElse(null);
		logger.info("Retornamos el proveedor");
		return proveedor;
	}
	
	@ApiOperation(value="Obtiene proveedores", notes="Retorna todos los proveedores registrados", response=List.class)
	@RequestMapping (value="proveedores", method=RequestMethod.GET)
	public List<Proveedor> obtenerProveedores() throws APIException{
		logger.info("Llamada al servicio de obtener todos los proveedores");
		logger.info("Retornamos todos los proveedores");
		return InMemory.PROVEEDORES;
	}
	
}

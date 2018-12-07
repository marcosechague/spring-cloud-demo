package py.com.springcloud.demo.productos.controller;

import java.math.BigDecimal;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import py.com.spring.cloud.productos.beans.Producto;
import py.com.spring.cloud.productos.enums.TipoProducto;
import py.com.springcloud.demo.bean.enums.Estado;
import py.com.springcloud.demo.common.exception.APIException;
import py.com.springcloud.demo.productos.constants.InMemory;


@RestController
public class ProductosAPI {

	private static Logger logger = Logger.getLogger(ProductosAPI.class);

	@ApiOperation(value="Crear un nuevo producto", notes="Registra un producto", response=Producto.class)
	@RequestMapping(value="productos", method=RequestMethod.POST, produces={"application/json"})
	public Producto registrarProducto(
			@ApiParam(value="Descripcion del producto", required=true, name="descripcion")
			@RequestParam(value="descripcion", required=true) String descripcion,
			
			@ApiParam(value="Precio del producto", required=true, name="precio")
			@RequestParam(value="precio",required=true) BigDecimal precio,
				
			@ApiParam(value="Tipo de producto", required=true, name="tipo")
			@RequestParam(value="tipo",required=true) TipoProducto tipo, 
			
			@ApiParam(value="Codigo del producto", required=false, name="codigo")
			@RequestParam(value="codigo",required=false) String codigo) throws APIException{
		
		logger.info("Llamada al servicio registrar producto");
		
		Producto producto = new Producto();
		//productoService.registrarProducto(descripcion, precio, tipo, codigo);
		producto.setId(InMemory.ID_PRODICTO.incrementAndGet());
		producto.setDescripcion(descripcion);
		producto.setPrecio(precio);
		producto.setTipo(tipo);
		producto.setCodigo(codigo);
		InMemory.PRODUCTOS.add(producto);
		logger.info("Retornamos el producto registrado");
		return producto;
	}
	
	
	@ApiOperation(value="Actualizar producto", notes="Actualiza datos de un producto", response=Producto.class)
	@RequestMapping(value="productos", method=RequestMethod.PUT, produces={"application/json"})
	public Producto actualizarProducto(
			@ApiParam(value="Descripcion del producto", required=true, name="descripcion")
			@RequestParam(value="descripcion", required=true) String descripcion,
			
			@ApiParam(value="Precio del producto", required=true, name="precio")
			@RequestParam(value="precio",required=true) BigDecimal precio,
				
			@ApiParam(value="Tipo de producto", required=true, name="tipo")
			@RequestParam(value="tipo",required=true) TipoProducto tipo, 
			
			@ApiParam(value="Codigo del producto", required=false, name="codigo")
			@RequestParam(value="codigo",required=false) String codigo,
			
			@ApiParam(value="Identificado del producto", required=false, name="id-producto")
			@RequestParam(value="id-producto",required=false) Integer idProducto) throws APIException{
		
		logger.info("Llamada al servicio actualizar producto");
		
		Producto producto = null;
		logger.info("Retornamos el producto actualizado");
		return producto;
	}
	
	@ApiOperation(value="Obtener el listado de productos", notes="Realiza una busqueda de los productos según una palabra clave. Si no se ingresa una palabra clave, trae todos los productos.", response=List.class)
	@RequestMapping(value="productos",method=RequestMethod.GET,produces={"application/json"})
	public List<Producto> buscarProductos(
			@ApiParam(value="Palabra clave para búsqueda de productos. Si no se ingresa una palabra clave, trae todos los productos.", required = false, name="palabra-clave")
			@RequestParam(value="palabra-clave", required=false) String palabraClave, 
			
			@ApiParam(value="Estado del producto. Puede ser ACTIVO/INACTIVO. Si no se especifica se retorna activos como inactivos.", required = false, name="estado")
			@RequestParam(value="estado", required=false) Estado estadoProducto ) throws APIException{
		logger.info("Llamada al servicio buscar productos");
		return InMemory.PRODUCTOS;

	}
	
	@ApiOperation(value="Obtener productos por id", notes="Recibe un id de producto y retorna el producto al que corresponde el id", response=Producto.class)
	@RequestMapping(value="productos/{id-producto}",method=RequestMethod.GET,produces={"application/json"})
	public Producto obtenetProductoPorId(
			@ApiParam(value="Id del producto", required=true, name="id-producto")
			@PathVariable(value="id-producto", required=true) Integer idProducto) throws APIException{
		logger.info("Llamada al servicio obtener producto por id");
		logger.info("Retornamos el producto.");		
		return InMemory.PRODUCTOS.stream().filter(p -> p.getId().equals(idProducto)).findFirst().orElse(null);
	}
	
	
}

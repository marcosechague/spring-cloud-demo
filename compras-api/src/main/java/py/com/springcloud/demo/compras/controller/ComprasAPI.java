package py.com.springcloud.demo.compras.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import py.com.springcloud.demo.common.exception.APIException;
import py.com.springcloud.demo.compras.beans.Compra;
import py.com.springcloud.demo.compras.dto.RegistroCompraDTO;
import py.com.springcloud.demo.compras.service.CompraService;

@RestController
public class ComprasAPI {

	private static final Logger LOGGER = Logger.getLogger(ComprasAPI.class);
	
	@Autowired
	private CompraService comprasService;
	
	@Autowired
	private HttpServletRequest request;
	
	@ApiOperation(value="Registra una nueva compra", notes="Registra una nueva compra", response=Compra.class)
	@RequestMapping (value="compras", method=RequestMethod.POST)
	public Compra registrarCompra( 
			@ApiParam(value="Objeto compra", required = true, name="compra")
			@RequestBody 
			@Valid
			RegistroCompraDTO compra) throws APIException{
		LOGGER.info("Llamada al servicio de registrar compras");
		Compra result  = comprasService.registrarCompra(compra, 1);
		LOGGER.info("Compra registrada. Retornamos compra registrada "+compra);
		return result;
	}
	
	@ApiOperation(value="Anula una compra", notes="Anula una compra y lo vuelva a estado inactivo", response=Boolean.class)
	@RequestMapping(value="compras/{id-compra}", method=RequestMethod.DELETE)
	public Boolean anularCompra (
			@ApiParam(value="Identificado de la compra", required = true, name="id-compra")
			@PathVariable(value="id-compra", required=true) Integer idCompra ) throws APIException{
		LOGGER.info("Llamada al servicio de anular compra");
		Boolean result = comprasService.anularCompra(idCompra);
		LOGGER.info("Compra anulada");
		return result;
		
	}
	
	@ApiOperation(value="Obtiene un listado de compras", notes="Retorna las compras que se encuentran en el rango de fechas", response=List.class)
	@RequestMapping(value="compras", method=RequestMethod.GET)
	public List<Compra> obtenerComprasPorFecha(
			@ApiParam(value="Fecha desde. Si es nulo se toma desde el inicio de los tiempos. Debe estar en formato dd/MM/yyyy", required = false, name="fecha-desde")
			@RequestParam(value="fecha-desde", required = false) String fechaDesde,
			@ApiParam(value="Fecha hasta. Si es nulo se toma hasta la última compra. Debe estar en formato dd/MM/yyyy", required = false, name="fecha-hasta")
			@RequestParam(value="fecha-hasta", required = false) String fechaHasta) throws APIException {
		LOGGER.info("Llamada al servicio obtener compras por fecha");
		List<Compra> compras = comprasService.obtenerComprasPorFecha("asdkasdka", fechaDesde, fechaHasta);
		LOGGER.info("Total [ "+compras.size()+" ] compras obtenidas");
		return compras;
	}
	
}

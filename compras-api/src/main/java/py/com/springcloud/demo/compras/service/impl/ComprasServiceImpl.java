package py.com.springcloud.demo.compras.service.impl;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import py.com.spring.cloud.proveedores.beans.Proveedor;
import py.com.springcloud.demo.bean.enums.Estado;
import py.com.springcloud.demo.common.exception.APIException;
import py.com.springcloud.demo.common.exception.APIExceptionType;
import py.com.springcloud.demo.common.exception.ErrorCode;
import py.com.springcloud.demo.common.utils.DateUtils;
import py.com.springcloud.demo.compras.beans.Compra;
import py.com.springcloud.demo.compras.beans.DetalleCompra;
import py.com.springcloud.demo.compras.clients.ProductosClient;
import py.com.springcloud.demo.compras.clients.ProveedoresClient;
import py.com.springcloud.demo.compras.constants.InMemory;
import py.com.springcloud.demo.compras.dto.RegistroCompraDTO;
import py.com.springcloud.demo.compras.service.CompraService;

@Service
public class ComprasServiceImpl implements CompraService{

	private static final Logger logger = Logger.getLogger(ComprasServiceImpl.class);
	
	@Autowired
	private ProveedoresClient proveedorClient;

	@Autowired
	private ProductosClient productosClient;
	
	@Override
	public Compra registrarCompra( RegistroCompraDTO compra, Integer idUsuario) throws APIException {
		
		logger.info("Registrando compra ");
		logger.info(compra);
		validarCompra(compra);
		Compra compraRegistrada = new Compra();
		compraRegistrada.setEstado(Estado.ACTIVO);//comprasDAO.registrarCompra(compra, idUsuario);
		compraRegistrada.setFechaCompra(new Date());
		compraRegistrada.setIdCompra(InMemory.ID_COMPRA.incrementAndGet());
		compraRegistrada.setMonto(compra.getMonto());
		compraRegistrada.setNroFactura("1000020399-9");
		compraRegistrada.setProveedor(compra.getProveedor());
		logger.info("Compra registrada ");
		
		return compraRegistrada;
	}

	@Override
	public Boolean anularCompra(Integer idCompra) throws APIException {
		logger.info("Anulando compra con id "+idCompra);
		long cantidadRegistrosEliminados = InMemory.COMPRAS.stream().filter(c->c.getIdCompra().equals(idCompra)).peek(c->c.setEstado(Estado.ANULADO)).count() ;
		if(cantidadRegistrosEliminados==0){
			throw new APIException(APIExceptionType.APPLICATION, ErrorCode.ERROR_ANULAR_COMPRA_ID_DESCONOCIDO,"No se encontro compra con id "+idCompra);
		}
		logger.info(String.format("Compra con id anulada correctamente",idCompra));
		return true;
	}

	@Override
	public List<Compra> obtenerComprasPorFecha(String contexto, 
			String fechaDesdeString,
			String fechaHastaString) throws APIException {
		
		logger.info("Retornando compras ");
		logger.info("fecha desde [ "+fechaDesdeString+" ]");
		logger.info("fecha hasta [ "+fechaHastaString+" ]");
		Date fechaDesde;
		Date fechaHasta;
		
		if(fechaDesdeString==null || fechaDesdeString=="null"){
			fechaDesdeString = "01/01/1900";
		}
		if(fechaHastaString==null || fechaHastaString=="null"){
			fechaHastaString = "12/12/2500";
		}
		try {
			fechaDesde = DateUtils.getSQLDataFromString(fechaDesdeString);
			fechaHasta = DateUtils.getSQLDataFromString(fechaHastaString);
		}catch(ParseException e){
			throw new APIException(APIExceptionType.APPLICATION, ErrorCode.ERROR_FORMATO_FECHA_INCORRECTO,"El formato de la fecha debe ser dd/MM/yyyy");
		}
		List<Compra> compras = InMemory.COMPRAS.stream().filter(c -> fechaDesde.before(c.getFechaCompra()) && fechaHasta.after(c.getFechaCompra())).collect(Collectors.toList());//comprasDAO.obtenerComprasPorFecha(fechaDesde, fechaHasta);
		compras = obtenerCompraCompleta(contexto,compras);
		logger.info("Las compras fueron obtenidas");
		return compras;
	}

	private void validarCompra(RegistroCompraDTO compra) throws APIException{
		
		if (compra ==null){
			throw new APIException(APIExceptionType.APPLICATION, ErrorCode.ERROR_VENTA_NULL, "El parametro venta es requerido");
		}
		
		
		if(compra.getMonto()==null||compra.getMonto().equals(new BigDecimal(0))){
			throw new APIException(APIExceptionType.APPLICATION, ErrorCode.ERROR_MONTO_COMPRA_NULL, "Compra sin monto");
		}
			
		if(compra.getDetalleCompra()==null || compra.getDetalleCompra().size()==0){
			throw new APIException(APIExceptionType.APPLICATION, ErrorCode.ERROR_DETALLE_COMPRA_NULL, "Compra sin detalles");
		}
	}
	
	//AQUI AGREGAMOS TODOS LOS DATOS DEL CLIENTE Y DEL PRODUCTO
	private List<Compra> obtenerCompraCompleta (String c, List<Compra> compras) throws APIException {
			
		List<Compra> result = new ArrayList<Compra>();
		for(Compra compra : compras){
			Proveedor proveedor= proveedorClient.obtenerProveedorPorId(c, compra.getProveedor().getId());
			compra.setProveedor(proveedor);
			List<DetalleCompra> detallesCompra = new ArrayList<DetalleCompra>();
			for(DetalleCompra detalle : compra.getDetalleCompra()){
				detalle.setProducto(productosClient.obtenetProductoPorId(c, detalle.getProducto().getId()));
				detallesCompra.add(detalle);
			}
			compra.setDetalleCompra(detallesCompra);
			result.add(compra);
		}
			
		return result;
	}
	
}

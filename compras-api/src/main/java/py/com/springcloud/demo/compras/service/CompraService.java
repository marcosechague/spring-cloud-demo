package py.com.springcloud.demo.compras.service;

import java.util.List;

import py.com.springcloud.demo.common.exception.APIException;
import py.com.springcloud.demo.compras.beans.Compra;
import py.com.springcloud.demo.compras.dto.RegistroCompraDTO;

public interface CompraService {

	public Compra registrarCompra(RegistroCompraDTO compra, Integer idUsuaio) throws APIException;
	public Boolean anularCompra(Integer idCompra) throws APIException;
	public List<Compra> obtenerComprasPorFecha(String apiKey, String fechaDesde, String fechaHasta) throws APIException;

}

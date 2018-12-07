package py.com.springcloud.demo.compras.clients;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import py.com.spring.cloud.proveedores.beans.Proveedor;
import py.com.springcloud.demo.common.exception.APIException;
import py.com.springcloud.demo.compras.configuration.FeignComprasConfiguration;


@FeignClient(name="proveedores", path="proveedores-api",configuration=FeignComprasConfiguration.class)
public interface ProveedoresClient {

	
	@RequestMapping (value="proveedores/{id-proveedor}", method=RequestMethod.GET)
	public Proveedor obtenerProveedorPorId(
			@RequestHeader("X-InfoCity-ApiKey") String apikey,
			@PathVariable(value="id-proveedor", required=true) Integer idProveedor) throws APIException;
	
}

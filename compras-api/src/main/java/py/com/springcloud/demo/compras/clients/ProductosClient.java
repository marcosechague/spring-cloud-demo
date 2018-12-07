package py.com.springcloud.demo.compras.clients;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import py.com.spring.cloud.productos.beans.Producto;
import py.com.springcloud.demo.common.exception.APIException;
import py.com.springcloud.demo.compras.configuration.FeignComprasConfiguration;


@FeignClient(name="productos", path="productos-api",configuration=FeignComprasConfiguration.class)
public interface ProductosClient {
	
	@RequestMapping(value="productos/{id-producto}",method=RequestMethod.GET,produces={"application/json"})
	public Producto obtenetProductoPorId(
			@RequestHeader("X-InfoCity-ApiKey") String apikey,
			@PathVariable(value="id-producto", required=true) Integer idProducto) throws APIException ;

}

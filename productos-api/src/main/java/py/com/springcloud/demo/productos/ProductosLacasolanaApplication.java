package py.com.springcloud.demo.productos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("py.com.lacasolana")
@EnableDiscoveryClient
public class ProductosLacasolanaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductosLacasolanaApplication.class, args);
	}
}

package py.com.springcloud.demo.compras;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("py.com.lacasolana")
@EnableDiscoveryClient
//@ImportAutoConfiguration(FeignAutoConfiguration.class)
@EnableFeignClients
public class ComprasLacasolanaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComprasLacasolanaApplication.class, args);
	}
}

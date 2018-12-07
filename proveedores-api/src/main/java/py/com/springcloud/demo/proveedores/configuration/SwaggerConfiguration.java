package py.com.springcloud.demo.proveedores.configuration;

import java.io.IOException;

import org.codehaus.plexus.util.xml.pull.XmlPullParserException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

	@Bean
	public Docket api() throws IOException, XmlPullParserException {
        return new Docket(DocumentationType.SWAGGER_2)  
                .select() 
                .apis(RequestHandlerSelectors.basePackage("py.com.springcloud.demo.proveedores.controller"))
                .paths(PathSelectors.any())                          
                .build().apiInfo(apiInfo());
	}
	
	private ApiInfo apiInfo() {
	    ApiInfo apiInfo = new ApiInfo(
	      "API de Proveedores de LA CASOLANA",
	      "API que provee todos los servicios del api de administracion de los proveedores de la La Casolana ",
	      "v0.0.1",
	      "marcos.echague@gmail.com",
	      "Marcos Echagüe",
	      "",
	      "");
	    return apiInfo;
	}
}
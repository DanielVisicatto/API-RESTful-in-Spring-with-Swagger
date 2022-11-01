package dio.myfirstwebapi.docs;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    private Contact contact() {
        return new Contact(
                "Seu nome",
                "http://www.yoursite.com.br",
                "voce@yoursite.com.br");
    }
    private ApiInfoBuilder apiInformation() {

        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();

        apiInfoBuilder.title("Title - Rest API");
        apiInfoBuilder.description("Use exemple: Springboot REST API");
        apiInfoBuilder.version("1.0");
        apiInfoBuilder.termsOfServiceUrl("Terms od use: Open Source");
        apiInfoBuilder.license("Licence - Your corporation license");
        apiInfoBuilder.licenseUrl("http://www.yoursite.com.br");
        apiInfoBuilder.contact(this.contact());

        return apiInfoBuilder;

    }
    @Bean
    public Docket apiDetails() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2);

        docket
                .select()
                .apis(RequestHandlerSelectors.basePackage("dio.myfirstwebapi.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(this.apiInformation().build())
                .consumes(new HashSet<String>(Arrays.asList("application/json")))
                .produces(new HashSet<String>(Arrays.asList("application/json")));

        return docket;
    }
}
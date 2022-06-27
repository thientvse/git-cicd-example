package com.example.demok8s;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Test API", version = "2.0", description = "Test Information"))
public class Demok8sApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demok8sApplication.class, args);
    }

}

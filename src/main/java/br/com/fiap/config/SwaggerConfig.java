package br.com.fiap.config;


import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI geraDocumentacao() {
        Server devServer = new Server();
        devServer.setUrl("http://localhost:8080");
        devServer.description("Url de desenvolvimento local");

        Contact contact = new Contact();
        contact.setEmail("rm96934@fiap.com.br");
        contact.setName("Leonardo Sagara");

        Info info = new Info().title("Checkpoint 2")
                .version("0.1")
                .contact(contact)
                .description("JPA Project");

        return new OpenAPI()
                .info(info)
                .servers(List.of(devServer));
    }
}

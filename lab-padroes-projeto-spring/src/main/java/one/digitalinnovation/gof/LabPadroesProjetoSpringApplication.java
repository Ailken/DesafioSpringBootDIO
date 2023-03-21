package one.digitalinnovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring boot gerado via spring initializr.
 * Os seguintes módulos foram selecionados:
 * - Spring Data JPA
 * - Spring WEB
 * - H2 Database
 * - OpenFeign
 *
 * @author ailken
 */
@EnableFeignClients
@SpringBootApplication
public class LabPadroesProjetoSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(LabPadroesProjetoSpringApplication.class, args);
    }
}
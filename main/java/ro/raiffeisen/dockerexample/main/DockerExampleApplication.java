package ro.raiffeisen.dockerexample.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"ro.raiffeisen"})
public class DockerExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerExampleApplication.class, args);
    }

}


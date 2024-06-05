package pl.wat.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
@EntityScan("pl.wat.backend.demo.entity")
@SpringBootApplication
public class BackendMain {

    public static void main(String[] args) {
        SpringApplication.run(BackendMain.class, args);
    }

}
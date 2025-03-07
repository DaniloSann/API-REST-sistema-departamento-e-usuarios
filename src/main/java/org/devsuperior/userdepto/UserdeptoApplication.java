package org.devsuperior.userdepto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("entities")
public class UserdeptoApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserdeptoApplication.class, args);
    }

}
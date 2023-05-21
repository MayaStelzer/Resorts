package com.maya.skiresorts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
public class SkiResortsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SkiResortsApplication.class, args);
    }

}

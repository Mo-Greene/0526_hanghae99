package com.sparta.work_0525;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Work0525Application {

    public static void main(String[] args) {
        SpringApplication.run(Work0525Application.class, args);
    }

}

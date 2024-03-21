package org.example.ktpm_20116031_votandat_lab6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
@EntityScan(basePackages = "org.example.ktpm_20116031_votandat_lab6.backend.models")
public class Ktpm20116031VoTanDatLab6Application {

    public static void main(String[] args) {
        SpringApplication.run(Ktpm20116031VoTanDatLab6Application.class, args);
    }



}

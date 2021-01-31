package ru.bvt.tgnotesagent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "ru.bvt.tgnotesagent.feign")

@SpringBootApplication
public class TgnotesagentApplication {

    public static void main(String[] args) {

        SpringApplication.run(TgnotesagentApplication.class, args);
    }

}

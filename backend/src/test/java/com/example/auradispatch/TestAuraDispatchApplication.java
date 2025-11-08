package com.example.auradispatch;

import org.springframework.boot.SpringApplication;

public class TestAuraDispatchApplication {

    public static void main(String[] args) {
        SpringApplication.from(AuraDispatchApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}

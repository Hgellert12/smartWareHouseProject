package com.smartinventory.smartwarehouseproject;

import org.springframework.boot.SpringApplication;

public class TestSmartWareHouseProjectApplication {

    public static void main(String[] args) {
        SpringApplication.from(SmartWareHouseProjectApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}

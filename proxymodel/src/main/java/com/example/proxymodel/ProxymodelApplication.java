package com.example.proxymodel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProxymodelApplication {

    public static void main(String[] args) {
        Host host = new Host();
        HouseProxy proxy = new HouseProxy(host);
        proxy.rent();

        SpringApplication.run(ProxymodelApplication.class, args);
    }

}

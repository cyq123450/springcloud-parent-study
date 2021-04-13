package com.cyq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 主启动类
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Orderzk80 {

    public static void main(String[] args) {
        SpringApplication.run(Orderzk80.class, args);
    }

}

package com.cyq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 主启动类
 */
@SpringBootApplication
@EnableEurekaServer
public class MainEureka7002 {

    public static void main(String[] args) {
        SpringApplication.run(MainEureka7002.class, args);
    }

}

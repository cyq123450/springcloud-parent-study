package com.cyq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 主启动类
 */
@SpringBootApplication
@EnableEurekaServer     // 启动Eureka服务端
public class MainEureka7001 {

    public static void main(String[] args) {
        SpringApplication.run(MainEureka7001.class, args);
    }

}

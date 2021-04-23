package com.cyq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 启动类
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServer8888 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServer8888.class, args);
    }

}

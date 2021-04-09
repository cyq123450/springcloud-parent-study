package com.cyq.conf;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 配置类
 */
@Configuration
public class BeanConfig {

    @Bean
    @LoadBalanced   // 使用LoadBalanced赋予了RestTemplate负载均衡的能力
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}

package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author sumail
 * @date 2019/9/4 0004-${time}
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class LeyouGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(LeyouGatewayApplication.class, args);
    }
}

package com.leyou.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author sumail
 * @date 2019/9/4 0004-${time}
 */
@SpringBootApplication
@EnableEurekaServer
public class LeyouRegistryApplication {
    public static void main(String[] args) {
        SpringApplication.run(LeyouRegistryApplication.class, args);
    }
}

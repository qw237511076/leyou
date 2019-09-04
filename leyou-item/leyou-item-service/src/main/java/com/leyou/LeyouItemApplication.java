package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author sumail
 * @date 2019/9/4 0004-${time}
 */
@SpringBootApplication
@EnableEurekaClient
public class LeyouItemApplication {
    public static void main(String[] args) {
        SpringApplication.run(LeyouItemApplication.class,args);
    }
}

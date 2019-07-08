package com.zzdz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;


/**
 * 整合监控数据
 *
 * 数据地址:
 * http://localhost:20001/turbine.stream
 */

@EnableTurbine
@SpringBootApplication
public class SpringcloudTurbineApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudTurbineApplication.class, args);
    }

}

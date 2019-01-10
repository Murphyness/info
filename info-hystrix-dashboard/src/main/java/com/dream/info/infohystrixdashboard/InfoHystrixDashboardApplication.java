package com.dream.info.infohystrixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringBootApplication
public class InfoHystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(InfoHystrixDashboardApplication.class, args);
    }

}


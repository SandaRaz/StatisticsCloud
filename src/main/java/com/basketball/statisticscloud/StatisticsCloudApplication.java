package com.basketball.statisticscloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.time.LocalDate;
import java.util.Date;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class StatisticsCloudApplication {

    public static void main(String[] args) {
        Match m = new Match(new Date());
        SpringApplication.run(StatisticsCloudApplication.class, args);
    }

}

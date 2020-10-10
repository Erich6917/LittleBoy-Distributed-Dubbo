package com.little.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SotConsumerApplication {

  public static void main(String[] args) {
    SpringApplication.run(SotConsumerApplication.class, args);
  }

}

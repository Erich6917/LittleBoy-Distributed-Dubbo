package com.little.cloud;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//@EnableDubboConfiguration
public class SotDubboApplication {

  public static void main(String[] args) {
    try {
      SpringApplication.run(SotDubboApplication.class, args);
    } catch (Exception e) {
      System.out.println(e);
    }
  }

}

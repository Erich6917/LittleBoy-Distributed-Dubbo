package com.little.cloud;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableDubboConfiguration   //启动dubbo服务
public class DubboProviderApplication {

  public static void main(String[] args) {
    try {
      SpringApplication.run(DubboProviderApplication.class, args);
    } catch (Exception e) {
      System.out.println(e);
    }
  }

}

package com.little.cloud.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.little.cloud.service.ProviderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Comment
 * @Author LiYuan
 * @Date 2020-9-29
 */
@RestController
@RequestMapping("test")
public class TestController {

  @Reference(version = "1.0.0",timeout = 30000)
  ProviderService providerService;


  @RequestMapping("ping")
  public void queryUserInfo(String test) {
    providerService.sayHello("SSS");
    System.out.println("ping ping ");

  }
}
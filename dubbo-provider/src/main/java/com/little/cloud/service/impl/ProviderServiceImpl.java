package com.little.cloud.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.little.cloud.service.ProviderService;

/**
 * @Comment
 * @Author LiYuan
 * @Date 2020-9-28
 */
@Service(version = "1.0.0", interfaceClass = ProviderService.class)
public class ProviderServiceImpl implements ProviderService {

  @Override
  public String sayHello(String word) {
    System.out.println("dubbo SayHello : " + word);
    return word;
  }
}
​	**Dobbo搭建注意事项**

- dubbo-api只定义接口，被dubbo-consumer和dubbo-provider引入

  dubbo-provider实现接口，通过dubbo提供服务
  dubbo-consumer调用服务

- dubbo-provider中接口实现类，

  ```
  @Service 不要和spring的注解混淆
  准确类为
  com.alibaba.dubbo.config.annotation.Service
  ```

- dubbo-consumer

  ```
    @Reference(version = "1.0.0",timeout = 30000)
    ProviderService providerService;
  
  使用时候，引用@Reference
  ```

- 关于配置文件

  ```
  dubbo包 有两种引入方式   
  1、com.alibaba.spring.boot引入没通过测试，卡住了很久，项目启动报错，找不到服务
  但是通过zk可以看到dubbo注册进去的服务
  （可以启动zk的客户端,输入命令ls /dubbo查看）
  2、org.apache.dubbo引入方式如下
  
  <dependency>
        <groupId>org.apache.dubbo</groupId>
        <artifactId>dubbo-spring-boot-starter</artifactId>
        <version>2.7.3</version>
        <exclusions>
          <exclusion>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-log4j12</artifactId>
          </exclusion>
        </exclusions>
      </dependency>
  
      <dependency>
        <groupId>org.apache.dubbo</groupId>
        <artifactId>dubbo</artifactId>
        <version>2.7.3</version>
      </dependency>
  ```

  
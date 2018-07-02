# tikie-eureka-feign-consumer
spring cloud全家桶，各个组件整合使用之feign服务消费者

## eureka服务消费者

    服务消费者是将服务从注册中心获取服务生产者的服务列表并维护在本地

    Spring Cloud Feign 是一个声明web服务客户端，这使得编写Web服务客户端更容易，使用Feign 创建一个接口并对它进行注解，
    它具有可插拔的注解支持包括Feign注解与JAX-RS注解，Feign还支持可插拔的编码器与解码器，Spring Cloud 增加了对 Spring MVC的注解，
    Spring Web 默认使用了HttpMessageConverters;可以简单的理解为：Spring Cloud Feign 的出现使得Eureka和Ribbon的使用更为简单。

### 参考网站
 + 相关学习博客，请查看[相关学习文档](http://www.cnblogs.com/cralor/p/9228678.html "spring boot 2.0.3+spring cloud （Finchley）3、声明式调用Feign")（原博客有部分错误，以本项目为准）
 + 如有任何问题欢迎联系作者：tikie
 
        qq:290315636
    
### 项目环境
 - Eclipse：Oxygen.3a Release (4.7.3a)
 
        彩色日志插件：http://www.mihai-nita.net/eclipse
 - jdk:1.8+
 - spring boot: 2.0.3.RELEASE
 - spring-cloud: Finchley.RELEASE

### 初始化操作
 1. NEW
 2. New Spring Starter Project
 3. Cloud Routing
 4. Feign
 
 + 运行服务提供者：TikieEurekaRibbonApplication.java
    
        Run As
        Run Java Application或Spring Boot App
 + 或命令行启动方式：
 
        java -jar tikie-eureka-ribbon-consumer-0.0.1-SNAPSHOT.jar.jar
 + 注册中心页面主节点：http://peer1:8761
 + 注册中心页面副节点：http://peer2:8761/
 + 刷新主、副节点可看到注册的Eureka的实例增加了，本服务提供者可以有多个实例
 
 + *本项目的默认只提供dev分支的更新权限*
 
 + 设置默认push/pull行为(push当前分支到远程同名分支，如果远程同名分支不存在则自动创建同名分支)
    
       git config push.default "current"
       git config pull.default "current"
       
       #在对应的分支上执行：如dev分支
       git branch --set-upstream-to=origin/dev
 
### 实现功能点

    1. 断路器：hystrix (熔断机制，避免雪崩效应)
    2. 断路器面板：hystrix dashboard (页面化展示熔断效果，统计管理接口)：http://localhost:9001/hystrix
    3. actuator 管理项：http://localhost:9101/actuator
        health信息：http://localhost:9101/actuator/health
        info信息：http://localhost:9101/actuator/info
        断路器动态请求：http://localhost:9101/actuator/hystrix.stream（可以请求http://localhost:9001/hi?name=cralor测试效果）
    4. 负载均衡(现在是轮流)
 
### 其他相关项目
    1. eureka注册中心 > https://github.com/290315636/tikie-eureka-registry-center
    2. eureka服务提供者(可以有多个实例) > https://github.com/290315636/tikie-eureka-provider
    3. eureka服务消费者 > https://github.com/290315636/tikie-eureka-ribbon-consumer
    4. feign 服务消费者 > https://github.com/290315636/tikie-eureka-feign-consumer
    5. monitor断路器监控器 > https://github.com/290315636/tikie-eureka-monitor-client
    6. zuul路由（断路、过滤）控制器 > https://github.com/290315636/tikie-eureka-zuul
    7. config-server配置中心服务  > https://github.com/290315636/tikie-eureka-config-server
    8. config-client配置中心用户 > https://github.com/290315636/tikie-eureka-config-client
    9. bus
    
    注. 3、4可以选中其一,优先使用feign;5可以不用启动（使用时启动）,8为测试配置使用，可以不启动，本项目在1.0.3已经使用了
### 历史更新

    1.0.2 更新配置从云端读取
    1.0.1 更新说明文档
    1.0.0 初始化服务提供者
/**
 * 
 * 项目名称：tikie-eureka-feign
 * 创建日期：2018年6月28日
 * 修改历史：
 * 		1、[2018年6月28日]创建文件 by zhaocs
 */
package com.tikie.eureka.feign.client;

import java.util.concurrent.TimeUnit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Retryer;

/**
 * @author zhaocs
 * 配置类，配置最大重试次数等
 */
@Configuration
public class FeignConfig {
    @Bean
    public Retryer feignRetryer(){
        return new Retryer.Default(100,TimeUnit.SECONDS.toMillis(1),5);
    }
}

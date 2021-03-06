/**
 * 
 * 项目名称：tikie-eureka-feign
 * 创建日期：2018年6月28日
 * 修改历史：
 * 		1、[2018年6月28日]创建文件 by zhaocs
 */
package com.tikie.eureka.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tikie.eureka.feign.hystrix.HiHystrix;

/**
 * @author zhaocs
 * feign服务接口，调用远程服务提供者的服务接口
 * 可以使用统一的断路器处理熔断逻辑
 */
@Component
@FeignClient(value = "eureka-provider", configuration = FeignConfig.class, fallback = HiHystrix.class)
public interface EurekaClientFeign {
    @GetMapping(value = "/hi")
    String sayHiFromClientEureka(@RequestParam(value = "name")String name);
}

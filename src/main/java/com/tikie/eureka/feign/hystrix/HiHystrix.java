/**
 * 
 * 项目名称：tikie-eureka-feign
 * 创建日期：2018年6月28日
 * 修改历史：
 * 		1、[2018年6月28日]创建文件 by zhaocs
 */
package com.tikie.eureka.feign.hystrix;

import org.springframework.stereotype.Component;

import com.tikie.eureka.feign.client.EurekaClientFeign;

/**
 * @author zhaocs
 * 熔断器实现
 */
@Component
public class HiHystrix implements EurekaClientFeign {

    /* (non-Javadoc)
     * @see com.tikie.eureka.feign.client.EurekaClientFeign#sayHiFromClientEureka(java.lang.String)
     */
    @Override
    public String sayHiFromClientEureka(String name) {
        return "hi,"+name+",sorry.error!";
    }

}

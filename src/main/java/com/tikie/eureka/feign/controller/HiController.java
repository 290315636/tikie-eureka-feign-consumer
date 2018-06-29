/**
 * 
 * 项目名称：tikie-eureka-feign
 * 创建日期：2018年6月28日
 * 修改历史：
 * 		1、[2018年6月28日]创建文件 by zhaocs
 */
package com.tikie.eureka.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tikie.eureka.feign.service.HiService;

/**
 * @author zhaocs
 *
 */
@RestController
public class HiController {
    @Autowired
    HiService hiService;

    @GetMapping("/hi")
    public String sayHi(@RequestParam(defaultValue = "cralor",required = false)String name){
        return hiService.sayHi(name);
    }
}

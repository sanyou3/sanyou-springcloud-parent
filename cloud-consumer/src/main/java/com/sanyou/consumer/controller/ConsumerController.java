package com.sanyou.consumer.controller;

import com.sanyou.consumer.feign.ProviderFeignClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 消费者
 *
 * @author sanyou
 * @date 2022/4/23 14:40
 */
@RequestMapping("/consumer")
@RestController
public class ConsumerController {

    @Resource
    private ProviderFeignClient providerFeignClient;

    @GetMapping("/sayHello/{username}")
    public String sayHello(@PathVariable("username") String username) {
        return providerFeignClient.sayHello(username);
    }

}

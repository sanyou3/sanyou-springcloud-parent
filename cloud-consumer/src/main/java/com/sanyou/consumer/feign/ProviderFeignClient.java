package com.sanyou.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * feign客户端
 *
 * @author sanyou
 * @date 2022/4/23 14:37
 */
@FeignClient("provider")
public interface ProviderFeignClient {

    @GetMapping("/provider//sayHello/{username}")
    String sayHello(@PathVariable("username") String username);

}

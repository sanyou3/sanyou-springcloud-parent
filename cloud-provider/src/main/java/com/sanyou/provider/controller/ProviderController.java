package com.sanyou.provider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * controller
 *
 * @author sanyou
 * @date 2022/4/23 14:33
 */
@RequestMapping("/provider")
@RestController
public class ProviderController {

    @GetMapping("/sayHello/{username}")
    public String sayHello(@PathVariable("username") String username) {
        return "hello," + username;
    }

}

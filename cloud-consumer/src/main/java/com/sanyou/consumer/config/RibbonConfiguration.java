package com.sanyou.consumer.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ribbon的配置类
 *
 * @author sanyou
 * @date 2022/5/1 13:13
 */
@Configuration
public class RibbonConfiguration {

    @Bean
    public IRule randomRule() {
        return new RandomRule();
    }

}

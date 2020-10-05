package com.ywx.springboot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xugangq
 * @description
 * @createTime 2020/5/7 11:08
 */
@Configuration
@EnableConfigurationProperties(MyProperties.class)
@Slf4j
public class McfAutoConfiguration {
    @Bean
    public HelloService helloService() {
        return new HelloService();
    }
}

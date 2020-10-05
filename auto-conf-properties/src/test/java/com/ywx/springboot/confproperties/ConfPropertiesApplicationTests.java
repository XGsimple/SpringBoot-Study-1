package com.ywx.springboot.confproperties;

import com.ywx.springboot.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConfPropertiesApplicationTests {
    @Autowired
    HelloService helloService;
    @Test
    void contextLoads() {
        helloService.getMyConf();
    }
}

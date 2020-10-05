package com.xugang.delayrabbitproducer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DelayrabbitproducerApplicationTests {
    @Autowired
    private Producer producer;

    @Test
    public void contextLoads() {
    }

    @Test
    public void sendLazy() throws  Exception {
        for (int i=0;i<5;i++){
            String msg = "hello spring boot: " + new Date();
            producer.sendLazy(msg + ":delay",i*2000);
        }
    }

}

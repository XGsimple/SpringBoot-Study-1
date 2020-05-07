package com.ywx.springboot;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * @author xugangq
 * @description
 * @createTime 2020/5/7 11:32
 */
@Slf4j
public class HelloService {
    private MyProperties myProperties;

    @Autowired
    private void setMyProperties(MyProperties myProperties) {
        this.myProperties = myProperties;
    }

    public void getMyConf() {
        String conf = String.format("name is %s,age is %d", myProperties.getName(), myProperties.getAge());
        System.out.println(conf);
    }
}

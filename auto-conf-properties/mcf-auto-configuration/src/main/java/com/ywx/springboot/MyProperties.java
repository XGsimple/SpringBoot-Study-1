package com.ywx.springboot;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author xugangq
 * @description
 * @createTime 2020/5/7 11:06
 */
@Data
@ConfigurationProperties(prefix = "mcf.ywx")
public class MyProperties {
    private String name ="默认name";
    private Integer age = 11;
}

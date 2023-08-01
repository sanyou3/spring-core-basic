package com.sanyou.spring.core.basic;

import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.ResourcePropertySource;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 三友的java日记
 *
 * @author 三友的java日记
 * @date 2023/7/22 18:31
 */
public class PropertySourceDemo {

    public static void main(String[] args) {

        Map<String, Object> source = new HashMap<>();
        source.put("name", "三友的java日记");

        PropertySource<Map<String, Object>> propertySource = new MapPropertySource("myPropertySource", source);

        Object name = propertySource.getProperty("name");

        System.out.println("name = " + name);
    }

}

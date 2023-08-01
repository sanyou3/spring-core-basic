package com.sanyou.spring.core.basic;

import cn.hutool.core.io.IoUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 三友的java日记
 *
 * @author 三友的java日记
 * @date 2023/7/22 18:15
 */
@SpringBootApplication
public class EnvironmentDemo {

    @Value("http://www.baidu.com")
    private Resource resource;

    public static void main(String[] args) throws IOException {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(EnvironmentDemo.class, args);

        EnvironmentDemo environmentDemo = applicationContext.getBean(EnvironmentDemo.class);

        Resource resource = environmentDemo.resource;

        String content = IoUtil.read(new InputStreamReader(resource.getInputStream()));
        System.out.println(content);

        //从ApplicationContext中获取到ConfigurableEnvironment
        ConfigurableEnvironment environment = applicationContext.getEnvironment();

        //获取name属性对应的值
        String name = environment.getProperty("name");
        System.out.println("name = " + name);

        Resource ad = environment.getRequiredProperty("ad", Resource.class);
        System.out.println("ad = " + ad);
    }

}

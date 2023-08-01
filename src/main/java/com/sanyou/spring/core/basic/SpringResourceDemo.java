package com.sanyou.spring.core.basic;

import cn.hutool.core.io.IoUtil;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.UrlResource;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * 三友的java日记
 *
 * @author 三友的java日记
 * @date 2023/7/16 10:57
 */
public class SpringResourceDemo {

    public static void main(String[] args) throws IOException {
        //构建资源
//        Resource resource = new UrlResource("http://www.baidu.com");

        ResourceLoader resourceLoader = new DefaultResourceLoader();
        Resource resource = resourceLoader.getResource("http://www.baidu.com");

        //获取资源输入流
        InputStream inputStream = resource.getInputStream();
        //通过hutool工具类读取流
        String content = IoUtil.read(new InputStreamReader(inputStream));
        System.out.println(content);
    }

}

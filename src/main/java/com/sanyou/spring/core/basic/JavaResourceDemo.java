package com.sanyou.spring.core.basic;

import cn.hutool.core.io.IoUtil;

import java.io.FileReader;
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
 * @date 2023/7/16 00:07
 */
public class JavaResourceDemo {

    public static void main(String[] args) throws IOException {
        //构建资源访问URL
//        URL url = new URL("http://www.baidu.com");
        URL url = new URL("file:///Users/mac/IdeaProjects/spring-core-basic/src/main/resources/sanyou.properties");

        //打开资源
        URLConnection urlConnection = url.openConnection();
        //获取资源输入流
        InputStream inputStream = urlConnection.getInputStream();
        //通过hutool工具类读取流
        String content = IoUtil.read(new InputStreamReader(inputStream));
        System.out.println(content);
    }

}

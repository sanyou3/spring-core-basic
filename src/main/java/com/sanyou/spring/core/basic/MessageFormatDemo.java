package com.sanyou.spring.core.basic;

import java.text.MessageFormat;
import java.util.Locale;

/**
 * 三友的java日记
 *
 * @author 三友的java日记
 * @date 2023/7/24 00:19
 */
public class MessageFormatDemo {

    public static void main(String[] args) {
        String message = MessageFormat.format("你好：{0}", "张三");
        System.out.println("message = " + message);
    }

}

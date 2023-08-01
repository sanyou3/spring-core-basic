package com.sanyou.spring.core.basic;

import org.springframework.context.MessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;

import java.util.Locale;

/**
 * 三友的java日记
 *
 * @author 三友的java日记
 * @date 2023/7/24 12:29
 */
public class MessageSourceDemo {

    public static void main(String[] args) {
        ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();

        //Spring已经扩展了ResourceBundle的Control，支持资源文件的不同编码方式，但是需要设置一下
        messageSource.setDefaultEncoding("UTF-8");

        //添加 baseName，就是前面提到的文件名称
        messageSource.addBasenames("message");

        //中文，传个中文名字
        String chineseWelcome = messageSource.getMessage("welcome", new Object[]{"张三"}, Locale.SIMPLIFIED_CHINESE);
        System.out.println("chineseWelcome = " + chineseWelcome);

        //英文，英语国家肯定是英文名 传个英文名字
        String englishWelcome = messageSource.getMessage("welcome", new Object[]{"Bob"}, Locale.ENGLISH);
        System.out.println("englishWelcome = " + englishWelcome);
    }

}

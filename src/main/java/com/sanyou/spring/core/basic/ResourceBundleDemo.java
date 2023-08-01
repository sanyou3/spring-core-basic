package com.sanyou.spring.core.basic;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * 三友的java日记
 *
 * @author 三友的java日记
 * @date 2023/7/23 22:54
 */
public class ResourceBundleDemo {

    public static void main(String[] args) {

        //获取ResourceBundle，第一个参数baseName就是我们的文件名称，第二个参数就是地区 \u4e09\u53cb\u7684java\u65e5\u8bb0
        ResourceBundle chineseResourceBundle = ResourceBundle.getBundle("message", Locale.SIMPLIFIED_CHINESE);
        String chineseName = chineseResourceBundle.getString("name");
        System.out.println("chineseName = " + chineseName);

        ResourceBundle englishResourceBundle = ResourceBundle.getBundle("message", Locale.ENGLISH);
        String englishName = englishResourceBundle.getString("name");
        System.out.println("englishName = " + englishName);

    }

}

package com.sanyou.spring.core.basic;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.PropertyValue;

/**
 * 三友的java日记
 *
 * @author 三友的java日记
 * @date 2023/7/23 16:46
 */
public class BeanWrapperDemo {

    public static void main(String[] args) {
        //创建user对象
        User user = new User();

        //创建BeanWrapper对象，把需要进行属性绑定的对象放进去
        BeanWrapper beanWrapper = new BeanWrapperImpl(user);

        //进行数据绑定，将三友的java日记这个属性值赋值到username这个属性上
        beanWrapper.setPropertyValue(new PropertyValue("username", "三友的java日记"));

        System.out.println("username = " + user.getUsername());
    }

}

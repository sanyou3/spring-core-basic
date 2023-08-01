package com.sanyou.spring.core.basic;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;

/**
 * 三友的java日记
 *
 * @author 三友的java日记
 * @date 2023/7/30 17:06
 */
public class BeanFactoryDemo {

    public static void main(String[] args) {
        //创建一个BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        //创建一个BeanDefinitionReader，构造参数是一个BeanDefinitionRegistry
        //因为DefaultListableBeanFactory实现了BeanDefinitionRegistry，所以直接把beanFactory当做构造参数传过去
        AnnotatedBeanDefinitionReader beanDefinitionReader = new AnnotatedBeanDefinitionReader(beanFactory);

        //读取当前类 BeanFactoryDemo 为一个Bean，让Spring帮我们生成这个Bean
        beanDefinitionReader.register(BeanFactoryDemo.class);

        //从容器中获取注册的BeanFactoryDemo的Bean
        BeanFactoryDemo beanFactoryDemo = beanFactory.getBean(BeanFactoryDemo.class);

        System.out.println("beanFactoryDemo = " + beanFactoryDemo);
    }

}

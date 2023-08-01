package com.sanyou.spring.core.basic;

import org.springframework.core.ResolvableType;

/**
 * 三友的java日记
 *
 * @author 三友的java日记
 * @date 2023/7/23 12:29
 */
public class ResolvableTypeDemo {

    public static void main(String[] args) throws NoSuchFieldException {
        ResolvableType myMapType = ResolvableType.forClass(MyMap.class);

        //resolve()方法 获取ResolvableType锁处理的class类型
        System.out.println("myMapType.resolve() = " + myMapType.resolve());

        //获取父类class类型对应的ResolvableType
        ResolvableType hashMapType = myMapType.getSuperType();

        //获取第一个泛型参数对应的ResolvableType
        ResolvableType firstGenericType = hashMapType.getGeneric(0);

        //获取第一个泛型参数对应的ResolvableType对应的class类型，也就是Integer的class类型
        Class<?> firstGenericClass = firstGenericType.resolve();
        System.out.println("firstGenericClass = " + firstGenericClass);

        //HashMap第二个泛型参数的对应的ResolvableType，也就是List<String>
        ResolvableType secondGenericType = hashMapType.getGeneric(1);
        //HashMap第二个泛型参数List<String>的第一个泛型类型对应的ResolvableType
        ResolvableType secondFirstGenericType = secondGenericType.getGeneric(0);
        //这样就获取到了List<String>的泛型类型
        Class<?> secondFirstGenericClass = secondFirstGenericType.resolve();
        System.out.println("secondFirstGenericClass = " + secondFirstGenericClass);

    }

}

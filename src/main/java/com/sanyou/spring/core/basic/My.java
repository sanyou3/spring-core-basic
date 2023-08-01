package com.sanyou.spring.core.basic;

/**
 * TODO
 *
 * @author yisuan
 * @date 2023/7/31 07:42
 */
public interface My {

    boolean containsProperty(String key);

    String getProperty(String key);

    <T> T getProperty(String key, Class<T> targetType);

    <T> T getProperty(String key, Class<T> targetType, T defaultValue);

    <T> T getRequiredProperty(String key, Class<T> targetType) throws IllegalStateException;

    String resolvePlaceholders(String text);

}

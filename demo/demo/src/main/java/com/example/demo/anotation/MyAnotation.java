package com.example.demo.anotation;

import java.lang.annotation.*;

/**
 * 自定义注解
 * ElementType.METHOD //方法中引用
 * ElementType.TYPE   //类和接口中引用
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME) //保留位置
@Documented //是否引入API文档
public @interface MyAnotation {
    String value() default "";
    String name();
    int num();
}

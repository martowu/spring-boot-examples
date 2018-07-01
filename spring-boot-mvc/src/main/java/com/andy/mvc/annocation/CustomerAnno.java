package com.andy.mvc.annocation;

import java.lang.annotation.*;

/**
 * @Author: Mr.lyon
 * @CreateBy: 2018-06-29 22:34
 **/

@Documented
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomerAnno {

    String name() default "hello";

    String value() default "";

    int max() default 0;

}
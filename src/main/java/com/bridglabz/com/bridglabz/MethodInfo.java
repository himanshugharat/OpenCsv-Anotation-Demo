package com.bridglabz.com.bridglabz;

import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodInfo {
    String author() default "himanshu";

    String date();

    int revision() default 1;

    String comments();
}


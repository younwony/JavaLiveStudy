package com.wony.liveStudy12_Annotation;

import com.wony.liveStudy11_Enum.color;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
public @interface customAnnotation {
    String name();
    int age() default 0;
    color COLOR_ENUM() default color.RED;
}

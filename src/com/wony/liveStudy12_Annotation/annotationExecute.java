package com.wony.liveStudy12_Annotation;

import com.wony.liveStudy11_Enum.color;

import java.lang.annotation.*;

/*@SafeVarargs //java.lang
@FunctionalInterface //java.lang
@Repeatable() //java.lang.annotation
@Override // java.lang
@Deprecated //java.lang
@SuppressWarnings() //java.lang
@Retention() //java.lang.annotation
@Target() //java.lang.annotation
@Documented //java.lang.annotation
@Inherited //java.lang.annotation
@Native// java.lang.annotation*/
public class annotationExecute {

    @customAnnotation(name = "test1")
    public void reflectionTest() {
        System.out.println("defalut method()");
    }

    @customAnnotation(name = "test2", age = 3)
    public void reflectionTest2(){
        System.out.println("defalut method2()");
    }

    @customAnnotation(name = "test3", age = 5, COLOR_ENUM = color.BLUE)
    public void reflectionTest3(){
        System.out.println("defulat method3()");
    }

}

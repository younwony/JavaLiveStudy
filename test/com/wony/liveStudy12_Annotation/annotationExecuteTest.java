package com.wony.liveStudy12_Annotation;

import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class annotationExecuteTest {

    @Test
    void reflectionTest(){

        //Annotation 선언된 Class 가져오기
        Class<annotationExecute> annotationExecuteClass = annotationExecute.class;
        // Class 내부 모든 Method 가져오기
        Method[] declaredMethods = annotationExecuteClass.getDeclaredMethods();

        //선언된 Annotation 가져오기
        Class<customAnnotation> customAnnotationClass = customAnnotation.class;


        for (Method declaredMethod : declaredMethods) {
            //가져온 Method 중 customAnnotation Annotation 이 선언된 메소드인지 체크
            if (declaredMethod.isAnnotationPresent(customAnnotationClass)){

                // method 에 선언된 annotation 가져오기
                customAnnotation annotation = declaredMethod.getAnnotation(customAnnotationClass);

                // method 이름
                System.out.print(declaredMethod.getName() + " : \t");
                // method 에 선언된 annotation age()
                System.out.print("age = " + annotation.age());
                // method 에 선언된 annotation name()
                System.out.print("\t name = " + annotation.name());
                // method 에 선언된 annotation color()
                System.out.println("\t color = " + annotation.COLOR_ENUM());

                try {
                    // method 호출
                    declaredMethod.invoke(new annotationExecute(), null);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    @Test
    void annotationReflection(){
        Class<customAnnotation> customAnnotationClass = customAnnotation.class;

        Method[] declaredMethods = customAnnotationClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getDefaultValue());
        }

        Constructor<?>[] declaredConstructors = customAnnotationClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor.getName());
        }

    }

}
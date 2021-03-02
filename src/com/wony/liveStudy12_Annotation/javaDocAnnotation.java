package com.wony.liveStudy12_Annotation;

import java.lang.annotation.Documented;
@Documented
public @interface javaDocAnnotation {
    String author();
    String date();
    int version();

}

package com.wony.liveStudy8_인터페이스;

public class studyClass implements study, study2{

    public void say(){
        System.out.println("this studyClass");
    }

    @Override
    public String name() {
        return null;
    }
}

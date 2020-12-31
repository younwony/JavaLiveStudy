package com.wony.liveStudy5;

public class StudyClass {

    /**
     * field
     */

    static String school; // static variable

    String name; // instance variable
    int age;
    int grade;

    // static 초기화 블럭
    static {
        school = "학교";
    }

    // instance 초기화 블럭
    {
        name = "없음";
        age = 0;
        grade = 1;

    }

    /**
     * Method(Constructor)
     */
    public StudyClass() {
    }

    public StudyClass(String name) {
        this.name = name;
    }

    public StudyClass(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    /**
     * Method
     */
    public void method() {

        int level = 0; // local variable

    }

}

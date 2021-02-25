package com.wony.liveStudy8_인터페이스;

interface study extends study2{

    /* 상수 */
    String studyName = "study";

    /* 메소드 */
    String name();
    /* default 메소드*/
    default String nameCheck() {
        return "nameCheck";
    }

    /* static 메소드*/
    static String nameStaticCheck(){
        return "nameStaticCheck";
    }

    /* private 메소드 */
    private String namePrivateCheck(){
        return  "namePrivateCheck";
    }

}

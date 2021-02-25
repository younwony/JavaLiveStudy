package com.wony.liveStudy8_인터페이스;

interface study2 {

    /* static */
    static void staticMethod(){
        System.out.println("static");
    }


    /* default */
    default int sumFactorial(int a, int b){
        return factorial(a)+factorial(b);
    }

    /* private */
    private int factorial(int a){
        if(a == 1) return 1;

        return a*factorial(a-1);
    }

    /* private static */
    private static void Test(){
        staticMethod();
        System.out.println("test private static");
    }

}

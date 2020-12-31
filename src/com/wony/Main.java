package com.wony;

public class Main {

    public static void main(String[] args) {

        int a = 0;
        int b = 1;

        /**
         * if(condition 1){
         *  code
         * }else if(condition 2){
         *  code 2
         * }else{
         *  code 3
         * }         *
         */

        if(a > b){
            System.out.println("a 는 b 보다 큽니다.");
        }else if (a < b){
            System.out.println("b 는 a 보다 큽니다.");
        }else{
            System.out.println("a 와 b는 같습니다.");
        }

        /**
         * codition 1 ? code 1 : code 2;
         */

        String result = "";

        result = a > b ? "a 는 b 보다 큽니다." : (a < b ? "b 는 a 보다 큽니다." : "a 와 b는 같습니다.");
    }
}

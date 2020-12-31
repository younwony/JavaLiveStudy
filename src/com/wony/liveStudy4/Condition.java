package com.wony.liveStudy4;

public class Condition {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        conditionIf(a, b);
        conditionIf3(a, b);
        conditionSwich(a, b);
    }

    private static void conditionSwich(int a, int b) {
        /**
         * switch(expression){
         *  case var 1 : code 1; break;
         *  case var 2 : code 2; break;
         *  default : code 3; break;
         *  }
         */
        int sum = a+b;
        switch (sum){
            case 0 :
                System.out.println("합계는 0 입니다.");
                break;
            case 1 :
                System.out.println("합계는 1 입니다.");
                break;
            default :
                System.out.println("합계를 알 수 없습니다.");
                break;
        }
    }

    private static void conditionIf3(int a, int b) {
        /**
         * codition 1 ? code 1 : code 2;
         */

        String result = "";

        result = a > b ? "a 는 b 보다 큽니다." : (a < b ? "b 는 a 보다 큽니다." : "a 와 b는 같습니다.");
    }

    private static void conditionIf(int a, int b) {
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
    }

}

package com.wony.liveStudy4;

public class Loop {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int[] aArray = {1,2,3,4,5};
        
       /* forLoop(aArray);
        forEachLoop(aArray);
        whileLoop(aArray);*/
        doWhileLoop(aArray);
    }

    private static void doWhileLoop(int[] aArray) {
        /**
         * do{
         *  code 1
         * }while(condition);
         */
        int i = 0;
        do {
            System.out.println(aArray[i++]);
        }while (i < aArray.length);
    }

    private static void whileLoop(int[] aArray) {
        /**
         * while(condition){
         *  code
         *  }
         */
        int i = 0;
        while (i < aArray.length){
            System.out.println(aArray[i++]);
        }
    }

    private static void forEachLoop(int[] aArray) {
         /**
         * for (type variableName : arrayName) {
         *   code 1
         * }
         */
        //iter
        for (int i : aArray) {

        }
    }

    private static void forLoop(int[] aArray) {
        /**
         * for (statement 1; statement 2; statement 3) {
         *   code 1
         * }
         */

        //itar
        for (int i = 0; i < aArray.length; i++) {
            int i1 = aArray[i];
        }
    }
}

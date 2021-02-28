package com.wony.liveStudy10_멀티쓰레드프로그래밍;

public class Main {
    public static void main(String[] args) {
        Thread thread = new ExtendsThread();
        Thread thread1 = new Thread(new RunThread());

        thread.start();
        thread1.start();

        //재사용
        //thread.start();

    }
}

package com.wony.liveStudy10_멀티쓰레드프로그래밍;

import java.text.DateFormat;
import java.util.Date;

public class ExtendsThread extends Thread{

    @Override
    public void run() {
        System.out.println(" == > this Thread extends Thread : " + this.getName() + " : " + Thread.currentThread().getName());
        for(int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName());
        }
    }
}

package com.wony.liveStudy10_멀티쓰레드프로그래밍;

public class targetThread extends Thread{
    @Override
    public void run() {
        for (long i = 0; i < 10000000; i++){}
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(long i = 0; i < 100000000; i++){}


    }
}

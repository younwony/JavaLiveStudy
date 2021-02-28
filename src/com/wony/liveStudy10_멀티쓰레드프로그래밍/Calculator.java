package com.wony.liveStudy10_멀티쓰레드프로그래밍;

public class Calculator {

    int memory;

    public int getMemory() {
        return memory;
    }

    public synchronized void setMemory(int memory) {
        this.memory = memory;

        try {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " : " + this.memory);
    }
}

package com.wony.liveStudy10_멀티쓰레드프로그래밍;

public class UserA extends Thread{
    private Calculator calculator;

    public UserA(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        this.setName("사람 A");
        calculator.setMemory(100);
    }
}

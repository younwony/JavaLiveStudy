package com.wony.liveStudy10_멀티쓰레드프로그래밍;

public class UserB extends Thread{
    private Calculator calculator;

    public UserB(Calculator calculator) {
        this.calculator = calculator;
    }
    @Override
    public void run() {
        this.setName("사람 B");
        calculator.setMemory(50);
    }
}

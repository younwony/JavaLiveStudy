package com.wony.liveStudy10_멀티쓰레드프로그래밍;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void test(){
        ExtendsThread[] threads = new ExtendsThread[5];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new ExtendsThread();
            threads[i].start();
        }
    }

    @Test
    void multiThread(){
        Calculator calculator = new Calculator();
        UserA userA = new UserA(calculator);
        UserB userB = new UserB(calculator);


        userA.start();
        userB.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
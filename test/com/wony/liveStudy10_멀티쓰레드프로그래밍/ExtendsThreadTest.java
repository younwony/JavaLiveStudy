package com.wony.liveStudy10_멀티쓰레드프로그래밍;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExtendsThreadTest {
    @Test
    void thread(){
        Thread thread = new ExtendsThread();
        thread.start();
    }

    @Test
    void test2(){
        Thread thread = new ExtendsThread();
        Thread thread1 = new ExtendsThread();

        // 우선순위 10 설정
        thread1.setPriority(10);

        System.out.println(thread.getName() + " : " + thread.getPriority());
        System.out.println(thread1.getName() + " : " + thread1.getPriority());

        thread.start();
        thread1.start();
    }


}
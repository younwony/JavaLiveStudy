package com.wony.liveStudy10_멀티쓰레드프로그래밍;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreadStatusTest {

    @Test
    void threadStatus() throws InterruptedException {
        Thread thread = new ThreadStatus(new targetThread());
        thread.start();

        Thread.sleep(1600);
    }


}
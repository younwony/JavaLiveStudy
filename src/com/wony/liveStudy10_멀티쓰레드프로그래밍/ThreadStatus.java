package com.wony.liveStudy10_멀티쓰레드프로그래밍;

public class ThreadStatus extends Thread{
    public Thread targetThread;

    public ThreadStatus(){}

    public ThreadStatus(Thread targetThread) {
        this.targetThread = targetThread;
    }

    @Override
    public void run() {
        while(true){
            State state = targetThread.getState();
            System.out.println("Target Thread status => " + state);

            if(state == State.NEW){
                targetThread.start();
            }

            if(state == State.TERMINATED){
                break;
            }
        }
    }
}

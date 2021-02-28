package com.wony.liveStudy10_멀티쓰레드프로그래밍;

public class synMethod {

    public synchronized void method(){
        //임계 영역, 단 하나의 스레드만 실행
    }

    public void methodFiled(){
        // 공유객체 파라미터,공유 객체가 자신이면 this 사용 가능
        synchronized (this){
            //임계 영역, 단 하나의 스레드만 실행
        }

        // 그외 여러 스레드가 실행 가능한 영역
        System.out.println("Thread~");
    }

}

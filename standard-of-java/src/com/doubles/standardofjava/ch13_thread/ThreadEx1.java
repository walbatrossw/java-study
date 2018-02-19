package com.doubles.standardofjava.ch13_thread;

public class ThreadEx1 {

    public static void main(String[] args) {

        // Thread를 상속받은 클래스의 인스턴스를 생성
        ThreadEx1_1 t1 = new ThreadEx1_1();

        // Runnable을 구현한 클래스의 인스턴스 생성
        Runnable r = new ThreadEx1_2();
        // 생성자 Thread(Runnable target)
        Thread t2 = new Thread(r);

        // 쓰레드 실행
        t1.start();
        t2.start();

        //t1.start(); //에러, 실행이 종료된 쓰레드는 다시 실행할 수 없음
        t1 = new ThreadEx1_1(); // 쓰레드 작업을 위해서는 쓰레드를 다시 생성해야 함
        t1.start();
    }

}


class ThreadEx1_1 extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName());  // Thread의 getName호출
        }
    }

}

class ThreadEx1_2 implements Runnable {

    public void run() {
        for (int i = 0; i < 5; i++) {
            // Thread.currentThread() : 현재 실행중인 Tread반환
            System.out.println(Thread.currentThread().getName());
        }
    }
}
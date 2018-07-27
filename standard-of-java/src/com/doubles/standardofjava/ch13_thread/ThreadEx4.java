package com.doubles.standardofjava.ch13_thread;

// 싱글 쓰레드 VS, 멀티 쓰레드
public class ThreadEx4 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 500; i++) {
            System.out.printf("%s", new String("-"));
        }

        System.out.println(" 소요시간1 : " + (System.currentTimeMillis() - startTime));

        for (int i = 0; i < 500; i++) {
            System.out.printf("%s", new String("|"));
        }

        System.out.println(" 소요시간2 : " + (System.currentTimeMillis() - startTime));

    }
}

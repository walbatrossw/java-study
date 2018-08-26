package com.doubles.standardofjava.ch13_thread;

import java.util.ArrayList;

public class ThreadWaitEx2 {

    public static void main(String[] args) {

        Table2 table = new Table2();    // 여러 쓰레드가 공유하는 객체

        new Thread(new Cook2(table), "COOK1").start();
        new Thread(new Customer2(table, "donut"), "CUST1").start();
        new Thread(new Customer2(table, "burger"), "CUST2").start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        }
        System.exit(0);
    }

}

// 손님 클래스
class Customer2 implements Runnable {

    private Table2 table;   // 테이블
    private String food;    // 음식

    public Customer2(Table2 table, String food) {
        this.table = table;
        this.food = food;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {

            }
            String name = Thread.currentThread().getName();
            if (eatFood()) {
                System.out.println(name + " ate a " + food);
            } else {
                System.out.println(name + " failed to eat.");
            }
        }
    }

    private boolean eatFood() {
        return table.remove(food);
    }
}

// 요리사 클래스
class Cook2 implements Runnable {

    private Table2 table;

    public Cook2(Table2 table) {
        this.table = table;
    }

    @Override
    public void run() {
        while (true) {
            // 임의의 요리를 선택해서 table에 추가
            int idx = (int) (Math.random() * table.dishNum());
            table.add(table.dishNames[idx]);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
        }
    }
}

// 테이블 클래스
class Table2 {

    // donut이 더 자주 나옴
    String[] dishNames = {"donut", "donut", "burger"};
    final int MAX_FOOD = 6; // 테이블에 놓을 수 있는 최대 음식의 개수

    private ArrayList<String> dishes = new ArrayList<>();

    // 음식 추가, 동기화
    public synchronized void add(String dish) {
        if (dishes.size() >= MAX_FOOD) {
            return;
        }
        dishes.add(dish);
        System.out.println("Dishes : " + dishes.toString());
    }

    // 음식 제거
    public boolean remove(String dishNames) {
        // 동기화
        synchronized (this) {
            while (dishes.size() == 0) {
                String name = Thread.currentThread().getName();
                System.out.println(name + " is waiting.");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {

                }
            }

            // 지정된 요리와 일치하는 요리를 테이블에서 제거
            for (int i = 0; i < dishes.size(); i++) {
                if (dishNames.equals(dishes.get(i))) {
                    dishes.remove(i);
                    return true;
                }
            }
            return false;
        }
    }

    public int dishNum() {
        return dishNames.length;
    }

}
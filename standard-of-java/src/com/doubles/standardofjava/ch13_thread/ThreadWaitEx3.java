package com.doubles.standardofjava.ch13_thread;

import java.util.ArrayList;

public class ThreadWaitEx3 {

    public static void main(String[] args) {

        Table3 table = new Table3(); // 여러 쓰레드가 공유하는 객체

        new Thread(new Cook3(table), "COOK1").start();
        new Thread(new Customer3(table, "donut"), "CUST1").start();
        new Thread(new Customer3(table, "donut"), "CUST2").start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
        System.exit(0);
    }

}

// 손님 클래스
class Customer3 implements Runnable {

    private Table3 table;
    private String food;

    Customer3(Table3 table, String food) {
        this.table = table;
        this.food = food;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
            String name = Thread.currentThread().getName();
            table.remove(food);
            System.out.println(name + " ate a " + food);
        }
    }

}

// 요리사 클래스
class Cook3 implements Runnable {

    private Table3 table;

    public Cook3(Table3 table) {
        this.table = table;
    }

    @Override
    public void run() {
        while (true) {
            // 임의의 요리를 선택해서 table에 추가
            int idx = (int) (Math.random() * table.dishNum());
            table.add(table.dishNames[idx]);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {

            }
        }
    }
}

// 테이블 클래스
class Table3 {

    // donut이 더 자주 나옴
    String[] dishNames = {"donut", "donut", "burger"};
    final int MAX_FOOD = 6;

    private ArrayList<String> dishes = new ArrayList<>();

    public synchronized void add(String dish) {
        while (dishes.size() >= MAX_FOOD) {
            String name = Thread.currentThread().getName();
            System.out.println(name + " is waiting.");
            try {
                wait(); // COOK 쓰레드를 기다리게 함
                Thread.sleep(500);
            } catch (InterruptedException e) {

            }
        }
        dishes.add(dish);
        notify();   // 기다리는 CUST 쓰레드를 깨우기 위함
        System.out.println("Dishes : " + dishes.toString());
    }

    public void remove(String dishName) {
        synchronized (this) {
            String name = Thread.currentThread().getName();
            while (dishes.size() == 0) {
                System.out.println(name + " is waiting.");
                try {
                    wait(); // CUST쓰레드를 기다리게 함
                    Thread.sleep(500);
                } catch (InterruptedException e) {

                }
            }

            while (true) {
                for (int i = 0; i < dishes.size(); i++) {
                    if (dishName.equals(dishes.get(i))) {
                        dishes.remove(i);
                        notify();  // 잠자는 COOK쓰레드를 깨우기 위함
                        return;
                    }
                }

                try {
                    System.out.println(name + " is waiting.");
                    wait(); // 원하는 음식이 없을 경우 CUST쓰레드를 기다리게 함
                    Thread.sleep(500);
                } catch (InterruptedException e) {

                }

            }

        }
    }

    public int dishNum() {
        return dishNames.length;
    }
}
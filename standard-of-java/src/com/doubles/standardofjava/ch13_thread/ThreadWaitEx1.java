package com.doubles.standardofjava.ch13_thread;

import java.util.ArrayList;

public class ThreadWaitEx1 {

    public static void main(String[] args) {
        Table table = new Table();  // 여러 쓰레드가 공유하는 객체

        new Thread(new Cook(table), "COOK1").start();
        new Thread(new Customer(table, "donut"), "CUST1").start();
        new Thread(new Customer(table, "burger"), "CUST2").start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {

        }
        System.exit(0);
    }

}

// 손님 클래스
class Customer implements Runnable {

    private Table table;    // 테이블
    private String food;    // 음식

    // 생성자 초기화
    public Customer(Table table, String food) {
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
            // 음식
            if (eatFood()) {
                System.out.println(name + " ate a " + food);
            } else {
                System.out.println(name + " failed to eat. ");
            }
        }
    }

    private boolean eatFood() {
        return table.remove(food);
    }

}

// 요리사 클래스
class Cook implements Runnable {

    private Table table;    // 테이블

    // 생성자
    Cook(Table table) {
        this.table = table;
    }

    @Override
    public void run() {
        while (true) {
            // 임의의 요리를 선택해서 table에 추가
            int idx = (int) (Math.random() * table.dishNum());
            table.add(table.dishNames[idx]);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {

            }
        }
    }
}

// 테이블 클래스
class Table {

    // donut이 더 자주 나옴
    String[] dishNames = {"donut", "donut", "burger"};
    final int MAX_FOOD = 6; // 테이블에 놓을 수 있는 최대 음식의 개수

    private ArrayList<String> dishes = new ArrayList<>();

    public void add(String dish) {
        if (dishes.size() >= MAX_FOOD) {
            return;
        }
        dishes.add(dish);
        System.out.println("Dishes : " + dishes.toString());
    }

    public boolean remove(String dishName) {
        // 지정된 요리와 일치하는 요리를 테이블에서 제거
        for (int i = 0; i < dishes.size(); i++) {
            if (dishName.equals(dishes.get(i))) {
                dishes.remove(i);
                return true;
            }
        }
        return false;

    }

    public int dishNum() {
        return dishNames.length;
    }

}

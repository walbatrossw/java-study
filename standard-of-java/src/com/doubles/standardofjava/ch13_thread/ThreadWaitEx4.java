package com.doubles.standardofjava.ch13_thread;

public class ThreadWaitEx4 {
    public static void main(String[] args) {

    }
}

class Customer4 implements Runnable {

    private Table4 table;
    private String food;

    public Customer4(Table4 table, String food) {
        this.table = table;
        this.food = food;
    }

    @Override
    public void run() {

    }

}

class Cook4 implements Runnable {

    @Override
    public void run() {

    }

}

class Table4 {

}
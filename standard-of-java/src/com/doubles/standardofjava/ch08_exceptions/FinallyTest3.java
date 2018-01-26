package com.doubles.standardofjava.ch08_exceptions;

public class FinallyTest3 {
    public static void main(String[] args) {
        method1();
        System.out.println("method1() ended and returned main() from method1()");
    }

    static void method1() {
        try {
            System.out.println("method1() called...");
            return;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("method1() finally block executed...");
        }
    }
}

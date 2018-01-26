package com.doubles.standardofjava.ch08_exceptions;

public class ExceptionEx13 {
    public static void main(String[] args) {
        method1();
    }

    static void method1() {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1()에서 예외처리");
            e.printStackTrace();
        }
    }

}

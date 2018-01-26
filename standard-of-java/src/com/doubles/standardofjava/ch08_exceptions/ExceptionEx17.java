package com.doubles.standardofjava.ch08_exceptions;

public class ExceptionEx17 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main()에서 예외처리");
        }
    }

    static void method1() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1()에서 예외처리");
            throw e;
        }
    }

}

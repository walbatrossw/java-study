package com.doubles.standardofjava.ch08_exceptions;

public class ExceptionEx14 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main()에서 예외처리");
            e.printStackTrace();
        }
    }

    static void method1() throws Exception {
        throw new  Exception();
    }
}

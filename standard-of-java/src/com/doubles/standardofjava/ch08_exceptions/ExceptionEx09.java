package com.doubles.standardofjava.ch08_exceptions;

public class ExceptionEx09 {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("예외 발생!");
            throw e;
        } catch (Exception e) {
            System.out.println("에러메시지 : "+e.getMessage());
            e.printStackTrace();
        }
        System.out.println("정상종료...");
    }
}

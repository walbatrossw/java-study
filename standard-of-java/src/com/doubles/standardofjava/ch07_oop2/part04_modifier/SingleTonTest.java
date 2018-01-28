package com.doubles.standardofjava.ch07_oop2.part04_modifier;

public class SingleTonTest {
    public static void main(String[] args) {
        // SingleTon st = new SingleTon(); // 에러발생, 생성자에 접근할 수 없기 때문
        SingleTon st = SingleTon.getInstance();
    }
}

final class SingleTon {
    private static SingleTon st = new SingleTon();

    private SingleTon() {

    }

    public static SingleTon getInstance() {
        if (st == null)
            st = new SingleTon();
        return st;
    }
}
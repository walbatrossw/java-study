package com.doubles.standardofjava.ch07_oop2.part08_innerclass;

public class InnerClassEx6 {

    Object iv = new Object() { void method() {} };  // 익명 클래스

    static Object cv = new Object() { void method() {} };   // 익명 클래스

    void myMethod() {
        Object lv = new Object() { void method() {} };  // 익명 클래스
    }
}

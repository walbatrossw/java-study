package com.doubles.standardofjava.ch07_oop2.part08_innerclass;

public class InnerClassEx1 {

    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
    }

    class InstanceInner {
        int iv = 100;
        //static int cv = 100; // static 변수를 선언 불가
        final static int CONST = 100;   // 상수이기에 선언 가능
    }

    static class StaticInner {
        int iv = 100;
        static int cv = 200; // static클래스만 static변수 선언이 가능
    }

    void myMethod() {
        class LocalInner {
            int iv = 300;
            // static int cv = 300; // static 변수선언 불가
            final static int CONST = 300; // 상수이기에 가능
        }
    }

}

package com.doubles.standardofjava.ch07_oop2.part05_polymorphism;

public class BindingTest {
    public static void main(String[] args) {
        Parent parent = new Child();
        Child child = new Child();

        // 조상타입의 참조변수를 사용
        System.out.println("parent.x = " + parent.x);
        parent.method();

        // 자손타입의 참보변수 사용
        System.out.println("child.x = " + child.x);
        child.method();
    }
}

class Parent {
    int x = 100;
    void method() {
        System.out.println("parent method");
    }
}

class Child extends Parent {
    int x = 200;
    void method() {
        System.out.println("child method");
    }
}
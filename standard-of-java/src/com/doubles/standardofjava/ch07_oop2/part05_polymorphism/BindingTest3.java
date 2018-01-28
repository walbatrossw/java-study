package com.doubles.standardofjava.ch07_oop2.part05_polymorphism;

public class BindingTest3 {
    public static void main(String[] args) {
        Parent3 parent3 = new Child3();
        Child3 child3 = new Child3();

        System.out.println("parent3.x = " + parent3.x);
        parent3.method();

        System.out.println();

        System.out.println("child3 = " + child3.x);
        child3.method();
    }
}

class Parent3 {
    int x = 100;
    void method() {
        System.out.println("parent3 method");
    }
}

class Child3 extends Parent3 {
    int x = 200;
    void method() {
        System.out.println("child3 method");
        System.out.println("x = " + x);
        System.out.println("super.x = " + super.x);
        System.out.println("this.x = " + this.x);
    }
}
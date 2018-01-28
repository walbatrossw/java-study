package com.doubles.standardofjava.ch07_oop2.part05_polymorphism;

public class BindingTest2 {
    public static void main(String[] args) {
        Parent2 parent2 = new Child2();
        Child2 child2 = new Child2();

        System.out.println("parent2.x = " + parent2.x);
        parent2.method();

        System.out.println("child2.x = " + child2.x);
        child2.method();
    }
}

class Parent2 {
    int x = 100;
    void method() {
        System.out.println("parent2 method");
    }
}

class Child2 extends Parent2 {

}

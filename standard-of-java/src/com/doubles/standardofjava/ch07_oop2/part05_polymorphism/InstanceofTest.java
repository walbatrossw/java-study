package com.doubles.standardofjava.ch07_oop2.part05_polymorphism;

public class InstanceofTest {
    public static void main(String[] args) {
        FireEngine3 fe = new FireEngine3();

        if (fe instanceof FireEngine3)
            System.out.println("this is a FireEngine3's instance");

        if (fe instanceof Car3)
            System.out.println("this is a Car3's instance");

        if (fe instanceof Object)
            System.out.println("this is a Object's instance");

        System.out.println(fe.getClass().getName());
    }
}

class Car3{

}

class FireEngine3 extends Car3 {

}


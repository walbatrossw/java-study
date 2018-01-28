package com.doubles.standardofjava.ch07_oop2.part05_polymorphism;

public class CastingTest2 {
    public static void main(String[] args) {
        Car car = new Car();    // 조상타입의 참조변수 선언, 조상타입의 인스턴스 생성
        Car car2 = null;        // 조상타입의 참조변수 선언
        FireEngine2 fe2 = null; // 자손타입의 참조변수 선언

        car.drive();                // 정상적으로 사용
//        fe2 = (FireEngine2) car;   // 에러, 조상타입의 인스턴스는 자손타입의 참조변수로 참조하는 것을 허용하지 않기때문
//        fe2.drive();
//        car2 = fe2;
//        car2.drive();
    }
}

class Car2 {
    String color;
    int door;

    void drive() {
        System.out.println("drive");
    }
    void stop() {
        System.out.println("stop");
    }
}

class FireEngine2 extends Car2 {
    void water() {
        System.out.println("water");
    }
}
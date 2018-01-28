package com.doubles.standardofjava.ch07_oop2.part05_polymorphism;

public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null; // 조상타입 참조변수 선언
        FireEngine fe = new FireEngine();   // 조상타입을 상속받은 자손클래스 타입의 참조변수를 선언하고 자손클래스의 인스턴스 생성
        FireEngine fe2 = null;  // 자손타입 참조변수 선언

        fe.water(); // 정상적으로 사용가능
        car = fe;   // 형변환 생략 : 자손 -> 조상
        // car.water(); // 컴파일에러, Car 타입의 참조변수로는 FireEngine 의 멤버를 사용할 수 없다.

        fe2 = (FireEngine) car; // 형변환 생략불가 : 조상 -> 자손
        fe2.water();
    }
}

class Car {
    String color;
    int door;

    void drive() {
        System.out.println("drive");
    }

    void stop() {
        System.out.println("stop");
    }
}

class FireEngine extends Car {

    void water() {
        System.out.println("water");
    }

}
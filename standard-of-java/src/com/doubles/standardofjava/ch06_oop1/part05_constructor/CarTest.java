package com.doubles.standardofjava.ch06_oop1.part05_constructor;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "black";
        car1.gearType = "auto";
        car1.door = 4;

        Car car2 = new Car("white", "auto", 5);

        System.out.println("car1 :" + car1.color + "/" + car1.gearType + "/" + car1.door);
        System.out.println("car2 :" + car2.color + "/" + car2.gearType + "/" + car2.door);
    }
}

class Car {
    String color;
    String gearType;
    int door;

    // 기본생성자
    Car() {}

    // 매개변수가 있는 생성자
    Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
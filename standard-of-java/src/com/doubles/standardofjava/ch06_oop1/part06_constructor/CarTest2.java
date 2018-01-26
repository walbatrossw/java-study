package com.doubles.standardofjava.ch06_oop1.part06_constructor;

public class CarTest2 {
    public static void main(String[] args) {
        Car2 carOne = new Car2();
        Car2 carTwo = new Car2("blue");

        System.out.println("carOne :" + carOne.color + "/" + carOne.gearType + "/" + carOne.door);
        System.out.println("carTwo :" + carTwo.color + "/" + carTwo.gearType + "/" + carTwo.door);
    }
}

class Car2 {
    String color;
    String gearType;
    int door;

    Car2() {
        this("white", "auto", 4);
    }

    Car2(String color) {
        this(color, "auto", 4);
    }

    Car2(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
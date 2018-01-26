package com.doubles.standardofjava.ch06_oop1.part06_constructor;

public class CarTest3 {
    public static void main(String[] args) {
        Car3 carOne = new Car3();
        Car3 carTwo = new Car3(carOne);

        System.out.println("carOne :" + carOne.color + "/" + carOne.gearType + "/" + carOne.door);
        System.out.println("carTwo :" + carTwo.color + "/" + carTwo.gearType + "/" + carTwo.door);

        carOne.door = 6;
        System.out.println("carOne.door = 6; 수행후");

        System.out.println("carOne :" + carOne.color + "/" + carOne.gearType + "/" + carOne.door);
        System.out.println("carTwo :" + carTwo.color + "/" + carTwo.gearType + "/" + carTwo.door);

    }
}

class Car3 {
    String color;
    String gearType;
    int door;

    Car3() {
        this("white", "auto", 4);
    }

    Car3(Car3 car3) {
        color = car3.color;
        gearType = car3.gearType;
        door = car3.door;
    }

    Car3(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
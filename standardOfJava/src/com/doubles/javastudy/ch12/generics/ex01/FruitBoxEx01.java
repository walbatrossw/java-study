package com.doubles.javastudy.ch12.generics.ex01;

import java.util.ArrayList;

// 예제1. 지네릭 클래스의 객체 생성과 사용
class FruitBoxEx01 {
    public static void main(String[] args) {
        // 제네릭 클래스의 객체 생성시 참조변수와 생성자에 대입된 타입이 일치해야한다.
        Box<Fruit> fruitBox = new Box<Fruit>();
        Box<Apple> appleBox = new Box<Apple>();
        Box<Toy> toyBox = new Box<Toy>();
//		Box<Grape> grapeBox = new Box<Apple>(); // 에러. 타입 불일치

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple()); // OK. void add(Fruit item)

        appleBox.add(new Apple());
        appleBox.add(new Apple());
//		appleBox.add(new Toy()); // 에러. Box<Apple>에는 Apple만 담을 수 있음

        toyBox.add(new Toy());
//		toyBox.add(new Apple()); // 에러. Box<Toy>에는 Apple을 담을 수 없음

        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(toyBox);
    }
}

// 제네릭클래스
class Box<T> {
    ArrayList<T> list = new ArrayList<T>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }
}

// 과일 클래스
class Fruit {
    public String toString() {
        return "Fruit";
    }
}

// 사과 클래스 (과일 클래스 상속)
class Apple extends Fruit {
    public String toString() {
        return "Apple";
    }
}

// 포도 클래스 (과일 클래스 상속)
class Grape extends Fruit {
    public String toString() {
        return "Grape";
    }
}

// 장난감 클래스
class Toy {
    public String toString() {
        return "Toy";
    }
}

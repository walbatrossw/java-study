package com.doubles.standardofjava.ch12_generic_enums_annotaiton.part01_generics;

import java.util.ArrayList;

public class FruitBoxEx2 {
    public static void main(String[] args) {
        FruitBox2<Fruit2> fruitBox = new FruitBox2<Fruit2>();
        FruitBox2<Apple2> appleBox = new FruitBox2<Apple2>();
        FruitBox2<Grape2> grapeBox = new FruitBox2<Grape2>();
        //FruitBox2<Grape2> grapeBox = new FruitBox2<Apple2>(); // 에러, 타입 불일치
        //FruitBox2<Toy2> toyBox = new FruitBox2<Toy2>(); // 에러

        fruitBox.add(new Fruit2());
        fruitBox.add(new Apple2());
        fruitBox.add(new Grape2());
        appleBox.add(new Apple2());
        //appleBox.add(new Grape2()); // 에러, Grape는 Apple의 자손이 아님
        grapeBox.add(new Grape2());

        System.out.println("fruitBox = " + fruitBox);
        System.out.println("appleBox = " + appleBox);
        System.out.println("grapeBox = " + grapeBox);
    }
}

interface Eatable {}

class Fruit2 implements Eatable {
    public String toString() {
        return "Fruit";
    }
}

class Apple2 extends Fruit2 {
    public String toString() {
        return "Apple";
    }
}

class Grape2 extends Fruit2 {
    public String toString() {
        return "Grape";
    }
}

class Toy2 {
    public String toString() {
        return "Toy";
    }
}

class Box2<T> {
    // ArrayList를 이용하여 여러 객체를 저장
    ArrayList<T> list = new ArrayList<T>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    ArrayList<T> getList() {
        return list;
    }

    int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }
}

// 타입 : Fruit2 상속, Eatable 구현 / 클래스 : Box2 상속
class FruitBox2<T extends Fruit2 & Eatable> extends Box2<T> {}
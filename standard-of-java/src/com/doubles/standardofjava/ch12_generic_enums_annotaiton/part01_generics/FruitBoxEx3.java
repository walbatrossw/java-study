package com.doubles.standardofjava.ch12_generic_enums_annotaiton.part01_generics;

import java.util.ArrayList;

public class FruitBoxEx3 {
    public static void main(String[] args) {
        FruitBox3<Fruit3> fruitBox = new FruitBox3<Fruit3>();
        FruitBox3<Apple3> appleBox = new FruitBox3<Apple3>();

        fruitBox.add(new Apple3());
        fruitBox.add(new Grape3());
        appleBox.add(new Apple3());
        appleBox.add(new Apple3());

        // 와일드카드 적용 전
        System.out.println(Juicer.makeJuice1(fruitBox));   // OK
        //System.out.println(Juicer.makeJuice1(appleBox)); // 에러, fruitBox 외에 다른 매개변수는 들어갈 수가 없음

        // 와일드카드 적용후
        System.out.println(Juicer.makeJuice2(fruitBox));    // OK
        System.out.println(Juicer.makeJuice2(appleBox));    // OK
    }
}

class Juicer {
    // 와일드 카드 적용 전
    // 매개변수를 FruitBox3<Fruit3>로 고정시킬 경우, FruitBox3<Apple3>는 매개변수가 될 수 없음
    static Juice makeJuice1(FruitBox3<Fruit3> box3) {
        String temp = "";

        for (Fruit3 fruit3 : box3.getList())
            temp += fruit3 + " ";

        return new Juice(temp);
    }

    // 아래와 같이 오버로딩을 할 경우, 컴파일 에러가 발생함
    // 제네릭타입이 다른 것만으로 오버로딩이 성립되지 않기 때문
    // 제네릭타입은 컴파일러가 컴파일할 때만 사용하고 제거해버리기 때문에 오버로딩이 아닌 메서드 중복정의가 되버림
//    static Juice makeJuice1(FruitBox3<Apple3> box3) {
//        String temp = "";
//
//        for (Fruit3 fruit3 : box3.getList())
//            temp += fruit3 + " ";
//
//        return new Juice(temp);
//    }

    // 와일드 카드 적용 이후
    // 매개변수로 FruitBox3<Fruit3>, FruitBox3<Apple3>, FruitBox3<Grape3> 전부다 가능해짐
    static Juice makeJuice2(FruitBox3<? extends Fruit3> box3) {
        String temp = "";

        for (Fruit3 fruit3 : box3.getList())
            temp += fruit3 + " ";

        return new Juice(temp);
    }
}

class Juice {
    String name;

    Juice(String name) {
        this.name = name + "Juice";
    }

    public String toString() {
        return name;
    }
}

class Box3<T> {

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

class FruitBox3<T extends Fruit3> extends Box3<T> {

}

class Fruit3 {
    public String toString() {
        return "Fruit";
    }
}

class Apple3 extends Fruit3 {
    public String toString() {
        return "Apple";
    }
}

class Grape3 extends Fruit3 {
    public String toString() {
        return "Grape";
    }
}
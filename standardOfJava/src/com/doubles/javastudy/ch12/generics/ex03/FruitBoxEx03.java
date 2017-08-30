package com.doubles.javastudy.ch12.generics.ex03;

import java.util.ArrayList;

// 예제 3. 와일드카드 상한제한

class FruitBoxEx03 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> appleBox = new FruitBox<Apple>();

        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        System.out.println(Juicer.makeJuice(fruitBox));
        System.out.println(Juicer.makeJuice(appleBox));
    }  // main
}

// 과일 상자 클래스(제네릭 과일타입 상속, 상자클래스 상속)
class FruitBox<T extends Fruit> extends Box<T> {
}

// 상자 클래스
class Box<T> {
    //class FruitBox<T extends Fruit> {
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

// 주스 클래스
class Juice {
    String name;

    Juice(String name) {
        this.name = name + "Juice";
    }

    public String toString() {
        return name;
    }
}

// 주서 클래스
class Juicer {
    // 주스를 만드는 클래스
    // 타입을 고정하지 않고 사용할 수 있도록 와일드 카드사용
    // <? extends T> : 와일드카드 상한제한, 자손들만 가능
    // <? super T> : 와일드카드 하한제한, 조상들만 가능
    // <?> : 와일드카드 제한없음, 모든 타입가능,
    static Juice makeJuice(FruitBox<? extends Fruit> box) {
        String tmp = "";

        for (Fruit f : box.getList()){
            tmp += f + " ";
        }

        return new Juice(tmp);
    }
}

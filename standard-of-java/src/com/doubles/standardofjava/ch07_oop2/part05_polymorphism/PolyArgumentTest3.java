package com.doubles.standardofjava.ch07_oop2.part05_polymorphism;

import java.util.Vector;

public class PolyArgumentTest3 {
    public static void main(String[] args) {
        Buyer3 buyer3 = new Buyer3();
        buyer3.buy(new Computer3());
        buyer3.buy(new Tv3());
        buyer3.buy(new Audio3());
        buyer3.summary();
    }
}

class Product3 {
    int price;
    int bonusPoint;

    Product3(int price) {
        this.price = price;
        bonusPoint = (int) (price/10.0);
    }

    Product3() {
        price = 0;
        bonusPoint = 0;
    }
}

class Tv3 extends Product3 {

    Tv3() {
        super(100);
    }

    public String toString() {
        return "Tv";
    }
}

class Computer3 extends Product3 {

    Computer3() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }

}

class Audio3 extends Product3 {

    Audio3() {
        super(50);
    }

    public String toString() {
        return "Audio";
    }
}

class Buyer3 {

    int money = 1000;   // 잔액
    int bonusPoint = 0; // 보너스 포인트
    Vector item = new Vector(); // 구입한 제품을 저장하기 위한 Vector 객체
    int i = 0;  // Product 배열에 사용될 카운터

    void buy(Product3 product) {
        if (money < product.price) {
            System.out.println("잔액이 부족합니다.");
            return;
        }

        money -= product.price;
        bonusPoint += product.bonusPoint;
        item.add(product);
        System.out.println(product + "을/를 구입하셨습니다.");
    }

    void refund(Product3 product3) {
        if (item.remove(product3)) {
            money += product3.price;
            bonusPoint -= product3.bonusPoint;
            System.out.println(product3 + "을/를 반품하셨습니다.");
        } else {
            System.out.println("구입하신 제품이 없습니다.");
        }
    }

    void summary() {
        int sum = 0;    // 구매한 물품의 가격합계
        String itemList = ""; // 구매한 물품목록

        if (item.isEmpty()) {
            System.out.println("구입하신 제품이 없습니다.");
            return;
        }

        for (int i = 0; i < item.size(); i++) {
            Product3 product = (Product3) item.get(i);
            sum += product.price;
            itemList += (i == 0) ? "" + product : "," + product;
        }
        System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}
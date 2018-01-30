package com.doubles.standardofjava.ch07_oop2.part05_polymorphism;

public class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer2 buyer2 = new Buyer2();
        buyer2.buy(new Computer2());
        buyer2.buy(new Tv2());
        buyer2.buy(new Audio2());
        buyer2.summary();
    }
}

class Product2 {
    int price;
    int bonusPoint;

    Product2(int price) {
        this.price = price;
        bonusPoint = (int) (price/10.0);
    }
}

class Tv2 extends Product2 {

    Tv2() {
        super(100);
    }

    public String toString() {
        return "Tv";
    }
}

class Computer2 extends Product2 {

    Computer2() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }

}

class Audio2 extends Product2 {

    Audio2() {
        super(50);
    }

    public String toString() {
        return "Audio";
    }
}

class Buyer2 {

    int money = 1000;   // 잔액
    int bonusPoint = 0; // 보너스 포인트
    Product2[] item = new Product2[10]; // 구매한 상품을 저장하기 위한 배열
    int i = 0;  // Product 배열에 사용될 카운터

    void buy(Product2 product) {
        if (money < product.price) {
            System.out.println("잔액이 부족합니다.");
            return;
        }

        money -= product.price;
        bonusPoint += product.bonusPoint;
        item[i++] = product;
        System.out.println(product + "을/를 구입하셨습니다.");
    }

    void summary() {
        int sum = 0;    // 구매한 물품의 가격합계
        String itemList = ""; // 구매한 물품목록

        for (int i = 0; i < item.length; i++) {
            if (item[i] == null)
                break;
            sum += item[i].price;
            itemList += (i == 0) ? "" + item[i] : "," + item[i];
        }
        System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}
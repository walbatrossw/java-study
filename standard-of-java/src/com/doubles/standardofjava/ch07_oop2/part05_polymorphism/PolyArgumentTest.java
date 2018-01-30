package com.doubles.standardofjava.ch07_oop2.part05_polymorphism;

public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        buyer.buy(new Tv());
        buyer.buy(new Computer());

        System.out.println("현재 잔액은 " + buyer.money + "만원 입니다.");
        System.out.println("현재 보너스 포인트는 " + buyer.bonusPoint + "점 입니다.");
    }

}

class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price/10.0);
    }
}

class Tv extends Product {

    Tv() {
        super(100);
    }

    public String toString() {
        return "Tv";
    }
}

class Computer extends Product {

    Computer() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }

}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product product) {
        if (money < product.price) {
            System.out.println("잔액이 부족합니다.");
            return;
        }

        money -= product.price;
        bonusPoint += product.bonusPoint;
        System.out.println(product + "을/를 구입하셨습니다.");
    }
}
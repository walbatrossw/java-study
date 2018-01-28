package com.doubles.standardofjava.ch07_oop2.part04_modifier;

public class FinalCardTest {
    public static void main(String[] args) {
        Card card = new Card("HEART", 10);
        System.out.println(card.KIND);
        System.out.println(card.NUMBER);
        System.out.println(card);
    }
}

class Card {
    final int NUMBER;       // 상수지만 선언과 함께 초기화하지 않고,
    final String KIND;      // 생성자에서 단 한번만 초기화 할 수 있다.
    static int width = 100;
    static int height = 250;

    public Card(String kind, int number) {
        KIND = kind;
        NUMBER = number;
    }

    public Card() {
        this("HEART", 1);
    }

    public String toString() {
        return KIND + " " + NUMBER;
    }
}
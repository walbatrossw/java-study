package com.doubles.standardofjava.ch07_oop2.part01_inheritance;

public class DeckTest {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Card card = deck.pick(0);
        System.out.println(card);

        deck.shuffle();
        card = deck.pick(0);
        System.out.println(card);
    }
}

class Deck {
    final int CARD_NUM = 52; // 전체 카드 수
    Card cardArr[] = new Card[CARD_NUM]; // 카드 갯수 만큼 배열 생성

    Deck() {
        int i = 0;
        for (int k = Card.KIND_MAX; k > 0; k--)
            for (int n = 0; n < Card.NUM_MAX; n++)
                cardArr[i++] = new Card(k, n+1);

    }

    Card pick(int index) {
        return cardArr[index];
    }

    Card pick() {
        int index = (int) (Math.random() * CARD_NUM);
        return pick(index);
    }

    void shuffle() {
        for (int i = 0; i < cardArr.length; i++) {
            int r = (int) (Math.random() * CARD_NUM);
            Card temp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = temp;
        }
    }
}

class Card {
    static final int KIND_MAX = 4; // 카드 무늬수
    static final int NUM_MAX = 13; // 무늬별 카드 수

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;

    int kind;
    int number;

    Card() {
        this(SPADE, 1);
    }

    Card(int kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public String toString() {
        String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
        String numbers = "0123456789XJQK";

        return "kind : " + kinds[this.kind] + ", number : " + numbers.charAt(this.number);
    }
}
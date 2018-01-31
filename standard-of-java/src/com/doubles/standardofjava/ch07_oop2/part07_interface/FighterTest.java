package com.doubles.standardofjava.ch07_oop2.part07_interface;

public class FighterTest {
    public static void main(String[] args) {
        Fighter fighter = new Fighter();
        if (fighter instanceof UnitA)
            System.out.println("fighter는 Unit클래스의 자손입니다.");
        if (fighter instanceof Fightable)
            System.out.println("fighter는 Fighter인터페이스를 구현했습니다.");
        if (fighter instanceof Moveable)
            System.out.println("fighter는 Moveable인터페이스를 구현했습니다.");
        if (fighter instanceof Attackable)
            System.out.println("fighter는 Attackable인터페이스를 구현했습니다.");
        if (fighter instanceof Object)
            System.out.println("fighter는 Object클래스의 자손입니다.");
    }
}

class Fighter extends UnitA implements Fightable {

    public void move(int x, int y) {

    }

    public void attack(UnitA unit) {

    }
}

class UnitA {
    int currentHP;
    int x;
    int y;
}

interface Fightable extends Moveable, Attackable {

}

interface Moveable {
    void move(int x, int y);
}

interface Attackable {
    void attack(UnitA unit);
}

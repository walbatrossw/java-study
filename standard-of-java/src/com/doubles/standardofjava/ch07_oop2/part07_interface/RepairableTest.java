package com.doubles.standardofjava.ch07_oop2.part07_interface;

public class RepairableTest {
    public static void main(String[] args) {
        Tank tank = new Tank();
        DropShip dropShip = new DropShip();
        Marine marine = new Marine();
        SCV scv = new SCV();

        scv.repair(tank);
        scv.repair(dropShip);
        //scv.repair(marine); // Repairable 인터페이스를 구현하지 않은 클래스의 인스턴스
    }
}

// 수리 인터페이스
interface Repairable {

}

// 지상유닛
class GroundUnit extends TerranUnit {

    public GroundUnit(int hp) {
        super(hp);
    }

}

// 공중유닛
class AirUnit extends TerranUnit {

    public AirUnit(int hp) {
        super(hp);
    }

}

// 유닛
class TerranUnit {

    int hitPoint;
    final int MAX_HP;

    TerranUnit(int hp) {
        MAX_HP = hp;
    }

}

// 탱크 : 지상유닛 상속, 수리 인터페이스 구현
class Tank extends GroundUnit implements Repairable {

    public Tank() {
        super(150);
        hitPoint = MAX_HP;
    }

    public String toString() {
        return "Tank";
    }

}

// 드랍쉽 : 공중유닛 상속, 수리 인터페이스 구현
class DropShip extends AirUnit implements Repairable {

    public DropShip() {
        super(125);
        hitPoint = MAX_HP;
    }

    public String toString() {
        return "DropShip";
    }
}

// 마린 : 지상유닛 상속
class Marine extends GroundUnit {

    public Marine() {
        super(40);
        hitPoint = MAX_HP;
    }

}

// SCV : 지상유닛 상속, 수리 인터페이스 구현
class SCV extends GroundUnit implements Repairable {

    public SCV() {
        super(60);
        hitPoint = MAX_HP;
    }

    // 수리 메서드 : 매개변수는 Repairable 인터페이스를 구현한 클래스의 인스턴스
    void repair(Repairable repairable) {
        // 매개변수로 넘어온 repairable은 정의된 멤버가 없기 때문에 repairable타입의 참조변수로는 할 수 있는게 없다.
        // 그래서 repairable연사자를 통해 타입을 체크
        if (repairable instanceof TerranUnit) {
            // hitPoint 와 MAX_HP를 사용하기 위해서는 TerranUnit 으로 형변환
            TerranUnit unit = (TerranUnit) repairable;
            // 현재 체력과 최대 체력이 같아질 때까지 체력을 증가시키는 작업을 수행
            while (unit.hitPoint != unit.MAX_HP) {
                unit.hitPoint++;
            }
            System.out.println(unit.toString() + "의 수리가 완료되었습니다.");
        }
    }
}
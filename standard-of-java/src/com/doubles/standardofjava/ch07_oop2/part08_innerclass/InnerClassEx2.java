package com.doubles.standardofjava.ch07_oop2.part08_innerclass;

public class InnerClassEx2 {

    class InstanceInner {

    }

    static class StaticInner {

    }

    // 인스턴스 멤버 간에는 서로 직접 접근가능
    InstanceInner iv = new InstanceInner();

    // static 멤버 간에는 서로 직접 접근가능
    static StaticInner cv = new StaticInner();

    static void staticMethod() {

        // static 멤버는 인스턴스멤버에 직접 접근불가
        //InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();

        // 굳이 접근하려한다면 객체를 먼저 생성해야 함,
        // 인스턴스클래스는 외부클래스를 먼저 생성해야만 생성이 가능
        InnerClassEx2 outer = new InnerClassEx2();
        InstanceInner obj = outer.new InstanceInner();

    }

    void instanceMethod() {

        // 인스턴스메서드에서는 인스턴스 멤버와 static 멤버 모두 접근가능
        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();

        // 메서드 내에 지역적으로 선언된 내부 클래스는 외부에서 접근불가
        //LocalInner lv = new LocalInner();

    }

    void myMethod() {
        class LocalInner {

        }
        LocalInner lv = new LocalInner();
    }
}

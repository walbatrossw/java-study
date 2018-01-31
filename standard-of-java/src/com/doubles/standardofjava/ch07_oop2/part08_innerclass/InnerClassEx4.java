package com.doubles.standardofjava.ch07_oop2.part08_innerclass;

public class InnerClassEx4 {

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.InstanceInner instanceInner = outer.new InstanceInner();
        System.out.println("instanceInner.iv : " + instanceInner.iv);
        System.out.println("Outer.StaticInner.cv : " + Outer.StaticInner.cv);

        Outer.StaticInner staticInner = new Outer.StaticInner();
        System.out.println("staticInner.iv : " + staticInner.iv);
    }

}

class Outer {

    class InstanceInner {
        int iv = 100;
    }

    static class StaticInner {
        int iv = 200;
        static int cv = 300;
    }

    void myMethod() {
        class LocalInner {
            int iv = 400;
        }
    }

}

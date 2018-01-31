package com.doubles.standardofjava.ch07_oop2.part08_innerclass;

public class InnerClassEx3 {

    private int outerIv = 0;
    static int outerCv = 0;

    class InstanceInner {
        int iiv = outerIv;  // 외부 클래스의 private 멤버도 접근가능
        int iiv2 = outerCv;
    }

    static class StaticInner {
        // static 클래스는 외부 클래스의 인스턴스 멤버에 접근불가
        //int siv = outerIv;
        static int scv = outerCv;
    }


    void myMethod() {
        int lv = 0;
        final int LV = 0;   // JDK 1.8 부터 final 생략가능

        class LocalInner {
            int liv = outerIv;
            int liv2 = outerCv;
            int liv3 = lv;  // JDK 1.8 부터는 에러가 아님
            int liv4 = LV;
        }
    }

}

package com.doubles.standardofjava.ch06_oop1.part04_overloading;

public class OverloadingTest {
    public static void main(String[] args) {

        MyMath3 myMath3 = new MyMath3();
        System.out.println("myMath3.add(3, 3) => result : " + myMath3.add(3, 3));
        System.out.println("myMath3.add(3L, 3) => result : " + myMath3.add(3L, 3));
        System.out.println("myMath3.add(3, 3L) => result : " + myMath3.add(3, 3L));
        System.out.println("myMath3.add(3L, 3L) => result : " + myMath3.add(3L, 3L));

        int[] a = {100, 200, 300};
        System.out.println("myMath3.add(a) => result : " + myMath3.add(a));
    }
}

class MyMath3 {

    int add(int a, int b) {
        System.out.print("int add(int a, int b) - ");
        return a + b;
    }

    long add(int a, long b) {
        System.out.print("long add(int a, long b) - ");
        return a + b;
    }

    long add(long a, int b) {
        System.out.print("long add(long a, int b) - ");
        return a + b;
    }

    long add(long a, long b) {
        System.out.print("long add(long a, long b) - ");
        return a + b;
    }

    int add(int[] a) {
        System.out.print("int add(int[] a) - ");
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }
        return result;
    }

}

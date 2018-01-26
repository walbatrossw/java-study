package com.doubles.standardofjava.ch06_oop1.part06_variable_init;

public class StaticBlockTest {
    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr["+i+"] : " + arr[i]);
        }
    }

    // 명시적 배열 초기화
    static int[] arr = new int[10];

    // 클래스 초기화 블럭 : 배열의 각요소들을 random()로 임의의 값을 채움
    static {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10) + 1;
        }
    }
}

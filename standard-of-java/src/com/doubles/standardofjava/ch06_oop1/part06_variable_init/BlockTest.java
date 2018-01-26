package com.doubles.standardofjava.ch06_oop1.part06_variable_init;

public class BlockTest {
    public static void main(String[] args) {

        System.out.println("BlockTest blockTest = new BlockTest()");
        BlockTest blockTest = new BlockTest();

        System.out.println();

        System.out.println("BlockTest blockTest2 = new BlockTest()");
        BlockTest blockTest2 = new BlockTest();

    }
    // 클래스 초기화 블럭
    static {
        System.out.println("static{} class init block");
    }
    // 인스턴스 초기화 블럭
    {
        System.out.println("{} : instance init block");
    }
    // 생성자
    public BlockTest() {
        System.out.println("BlockTest() : constructor");
    }
}

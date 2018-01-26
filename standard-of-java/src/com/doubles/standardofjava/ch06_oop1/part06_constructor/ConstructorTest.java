package com.doubles.standardofjava.ch06_oop1.part06_constructor;

public class ConstructorTest {
    public static void main(String[] args) {
        Data1 data1 = new Data1();
        Data2 data2 = new Data2(); // 컴파일 오류 기본생성자가 없기 때문에
    }
}

class Data1 {
    int value;
}

class Data2 {
    int value;

    Data2() {}; //컴파일 오류를 수정하기 위해서는 기본 생성자를 추가해줘야 함

    Data2(int x) {
        value = x;
    }
}
package com.doubles.standardofjava.ch06_oop1.part06_variable_init;

public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        System.out.println("p1 serialNo : " + p1.serialNo);
        System.out.println("p2 serialNo : " + p2.serialNo);
        System.out.println("p3 serialNo : " + p3.serialNo);

        System.out.println("generated product's count : " + Product.count);
    }
}

class Product {
    static int count = 0; // 클래스 변수
    int serialNo; // 인스턴스 변수

    {
        ++count;
        serialNo = count;
    }

    public Product() {

    }
}
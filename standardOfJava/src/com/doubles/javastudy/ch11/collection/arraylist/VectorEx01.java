package com.doubles.javastudy.ch11.collection.arraylist;

import java.util.Vector;

public class VectorEx01 {
    public static void main(String[] args) {
        Vector v = new Vector(5); // 용량이 5인 Vector 생성
        v.add("1");
        v.add("2");
        v.add("3");
        print(v);

        // 빈공간 제거, 용량과 크기가 같아진다. 용량이 줄어드는 것이 아니라 사이즈와 동일한 용량을 가진 인스턴스가 새로 생성된다.
        v.trimToSize();
        System.out.println("=== After trimToSize() ===");
        print(v);

        // 용량이 최소 6이 되도록 한다.
        v.ensureCapacity(6);
        System.out.println("=== After ensureCapacity(6) ===");
        print(v);

        // size가 7이 되도록 한다. Vector는 용량이 부족할 경우 자동적으로 기존의 크기보다 2배의 크기로 증가된다.
        v.setSize(7);
        System.out.println("=== After setSize(7) ===");
        print(v);

        // 모든 요소를 삭제한다.
        v.clear();
        System.out.println("=== After clear() ===");
        print(v);

    }

    public static void print(Vector v) {
        System.out.println(v);
        System.out.println("size = " + v.size());
        System.out.println("capacity = " + v.capacity());
        System.out.println();
    }
}

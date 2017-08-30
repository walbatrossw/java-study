package com.doubles.javastudy.ch11;

import java.util.ArrayList;

// ArrayList를 이용한 교집합, 차집합, 합집합 구하기
public class Execise11_1 {
    public static void main(String[] args) {

        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();
        ArrayList intersection = new ArrayList();       // 교집합
        ArrayList differenceOfSet = new ArrayList();    // 차집합
        ArrayList union = new ArrayList();              // 합집합

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);

        // 교집합
        intersection.addAll(list1);
        intersection.retainAll(list2);  // ratainAll : 지정한 컬렉션에서 공통된 것만 남기고 나머지 삭제

        // 차집합
        differenceOfSet.addAll(list1);
        differenceOfSet.removeAll(list2);  // removeAll : 지정한 컬렉션에 저장된 것과 동일한 객체들을 삭제

        // 합집합
        union.addAll(list1);    // list1을 요소에 추가
        union.removeAll(list2); // list2와 중복되는 요소를 제거
        union.addAll(list2);    // list1의 차집합 + list2

        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);

        System.out.println("intersection = " + intersection);
        System.out.println("differenceOfSet = " + differenceOfSet);
        System.out.println("union = " + union);

    }
}

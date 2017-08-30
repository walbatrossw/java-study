package com.doubles.javastudy.ch11.collection.arraylist;

import java.util.ArrayList;

public class ArrayListEx00 {
    public static void main(String[] args) {

        // 배열
        String[] arrayObj = new String[2];
        arrayObj[0] = "one";
        arrayObj[1] = "two";
        // arrayObj[3] = "three"; // 배열의 길이를 벗어나 데이터를 저장하면 오류 발생
        for (int i = 0; i < arrayObj.length; i++) {
            System.out.println(arrayObj[i]);
        }

        // 컬렉션 프레임워크 ArrayList
        // 따로 길이를 지정하지 않아도 상관없음
        ArrayList al = new ArrayList();
        // Object타입
        al.add("one");
        al.add("two");
        al.add("three");
        for (int i = 0; i < al.size(); i++) {
            // String 형변환
            String value = (String) al.get(i);
            System.out.println(value);
        }

    }
}

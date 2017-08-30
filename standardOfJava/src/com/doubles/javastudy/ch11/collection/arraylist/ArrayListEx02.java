package com.doubles.javastudy.ch11.collection.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx02 {
    public static void main(String[] args) {

        final int LIMIT = 10; // 자르려는 문자열의 길이
        String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()///";  // 자르려는 문자열
        int length = source.length(); // 전체길이

        // ArratList를 생성할때, 저장할 요소의 갯수를 고려해 실제 저장할 개수보다 약간 여유있는 크기로 하는 것이 좋다
        // 생성할 때 지정한 크기보다 더 많은 객체를 저장하면 자동적으로 크기가 늘어나지만 처리시간이 그만큼 소요된다.
        List list = new ArrayList(length/LIMIT + 10);   // 크기를 약간 여유있게

        // 원하는 길이만큼 잘라서 ArrayList에 담기위한 반목문
        // 0번째 부터 전체길이까지, LIMIT 길이만큼 증가시키면서 반복
        for (int i = 0; i < length; i += LIMIT) {
            if (i + LIMIT < length) {
                list.add(source.substring(i, i+LIMIT));
            } else {
                list.add(source.substring(i));
            }
        }
        // 출력 반복문
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

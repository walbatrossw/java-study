package com.doubles.standardofjava.ch14_lambda_stream.part01_lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// 컬렉션 프레임워크 함수형 인터페이스
public class LambdaEx4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // 0 ~ 9까지 저장
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        // 모든 요소 출력
        list.forEach(i -> System.out.print(i + ", "));
        System.out.println();

        // 2의 배수, 3의 배수 제거
        list.removeIf(x -> x % 2 == 0 || x % 3 == 0);
        System.out.println(list);

        list.replaceAll(i -> i * 10);   // 각 요소에 10을 곱한다
        System.out.println(list);

        // map의 모든 요소를 {k, v} 형식으로 출력
        Map<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "4");
        map.forEach((k, v) -> System.out.print("{" + k + ", " + v + "} , "));
        System.out.println();
    }
}

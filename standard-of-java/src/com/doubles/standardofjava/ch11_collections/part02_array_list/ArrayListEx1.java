package com.doubles.standardofjava.ch11_collections.part02_array_list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {
    public static void main(String[] args) {

        ArrayList list1 = new ArrayList(10);
        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(3));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        // list2 에 list1에 저장된 객체 중에서 1번째부터 4번째까지 저장
        ArrayList list2 = new ArrayList(list1.subList(1, 4));
        print(list1, list2);

        // list1, list2 정렬
        Collections.sort(list1);
        Collections.sort(list2);
        print(list1, list2);

        // list1이 list2의 모든요소를 포함하고 있는지 확인
        System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));

        // 새로운 객체를 추가
        list2.add("B");
        list2.add("C");
        list2.add(3, "A");  // 3번째에 새로운 객체 추가하고, 3번째부터 저장된 객체들은 4번째 요소부터 저장됨
        print(list1, list2);

        // 3번째 요소에 새로운 객체로 교체
        list2.set(3, "AA");
        print(list1, list2);

        // list1, list2에 저장된 객체중에서 주어진 컬렉션과 공통된 것만 남기고 나머지는 삭제
        System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
        print(list1, list2);


        for (int i = list2.size() - 1; i >= 0; i--) {
            if (list1.contains(list2.get(i)))
                list2.remove(i);
        }
        print(list1, list2);
    }

    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1 : " + list1);
        System.out.println("list2 : " + list2);
        System.out.println();
    }
}

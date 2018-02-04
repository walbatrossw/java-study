package com.doubles.standardofjava.ch11_collections.part13_collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import static java.util.Collections.*;

public class CollectionEx1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(list);

        addAll(list, 1,2,3,4,5);
        System.out.println(list);

        // 오른쪽으로 두 칸씩 이동
        rotate(list, 2);
        System.out.println(list);

        // 첫번째와 세번째를 교환
        swap(list, 0, 2);
        System.out.println(list);

        // 저장된 요소의 위치를 임의로 변경
        shuffle(list);
        System.out.println(list);

        // 정렬
        sort(list);
        System.out.println(list);

        // 오름차순 정렬
        sort(list, reverseOrder());
        System.out.println(list);

        System.out.println("max = " + max(list));
        System.out.println("min = " + min(list));
        System.out.println("min = " + max(list, reverseOrder()));

        // list를 9로 채움
        fill(list, 9);
        System.out.println("list = " + list);

        // list와 같은 크기의 새로운 list를 생성하고 2로 채움
        List newList = nCopies(list.size(), 2);
        System.out.println("newList = " + newList);

        // 공통요소가 없으면 true
        System.out.println(disjoint(list, newList));

        copy(list, newList);
        System.out.println("newList = " + newList);
        System.out.println("list = " + list);

        replaceAll(list, 2, 1);
        System.out.println("list = " + list);

        Enumeration enumeration = enumeration(list);
        ArrayList list2 = list(enumeration);
        System.out.println("list2 = " + list2);
    }
}

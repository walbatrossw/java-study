package com.doubles.standardofjava.ch11_collections.part03_linked_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListTest2 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(1000000);
        LinkedList linkedList = new LinkedList();
        add(arrayList);
        add(linkedList);

        System.out.println("access time test");
        System.out.println("Array List : " + access(arrayList));
        System.out.println("Linked List : " + access(linkedList));
    }

    public static void add(List list) {
        for (int i = 0; i < 100000; i++)
            list.add(i + "");
    }

    public static long access(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++)
            list.get(i);
        long end = System.currentTimeMillis();
        return end - start;
    }
}

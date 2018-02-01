package com.doubles.standardofjava.ch11_collections.part05_iterator_listiterator_enumeration;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        ListIterator listIterator = list.listIterator();

        while (listIterator.hasNext()) {
            // 순반향으로 진행하면서 읽어옴
            System.out.println(listIterator.next());
        }
        System.out.println();

        while (listIterator.hasPrevious()) {
            // 역방향으로 진행하면서 읽어옴
            System.out.println(listIterator.previous());
        }
        System.out.println();
    }
}

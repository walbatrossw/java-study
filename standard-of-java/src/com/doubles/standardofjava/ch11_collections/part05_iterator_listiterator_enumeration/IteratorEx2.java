package com.doubles.standardofjava.ch11_collections.part05_iterator_listiterator_enumeration;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx2 {
    public static void main(String[] args) {
        ArrayList original = new ArrayList(10);
        ArrayList copy1 = new ArrayList(10);
        ArrayList copy2 = new ArrayList(10);

        for (int i = 0; i < 10; i++)
            original.add(i +"");

        Iterator iterator = original.iterator();

        while (iterator.hasNext())
            copy1.add(iterator.next());

        System.out.println("original에서 copy1으로 복사");
        System.out.println("original : " + original);
        System.out.println("copy1 : " + copy1);
        System.out.println();

        iterator = original.iterator();

        while (iterator.hasNext()) {
            copy2.add(iterator.next());
            iterator.remove();
        }

        System.out.println("original에서 copy2으로 이동");
        System.out.println("original : " + original);
        System.out.println("copy2 : " + copy2);
    }
}

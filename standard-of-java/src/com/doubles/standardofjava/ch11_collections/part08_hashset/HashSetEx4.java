package com.doubles.standardofjava.ch11_collections.part08_hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx4 {
    public static void main(String[] args) {
        HashSet setA = new HashSet();
        HashSet setB = new HashSet();
        HashSet setUnion = new HashSet();
        HashSet setInter = new HashSet();
        HashSet setDiff1 = new HashSet();
        HashSet setDiff2 = new HashSet();

        setA.add("1");
        setA.add("2");
        setA.add("3");
        setA.add("4");
        setA.add("5");
        System.out.println("A = " + setA);

        setB.add("4");
        setB.add("5");
        setB.add("6");
        setB.add("7");
        setB.add("8");
        System.out.println("B = " + setB);

        Iterator iterator = setB.iterator();
        while (iterator.hasNext()) {
            Object temp = iterator.next();
            if (setA.contains(temp))
                setInter.add(temp);
        }

        iterator = setA.iterator();
        while (iterator.hasNext()) {
            Object temp = iterator.next();
            if (!setB.contains(temp))
                setDiff1.add(temp);
        }

        iterator = setB.iterator();
        while (iterator.hasNext()) {
            Object temp = iterator.next();
            if (!setA.contains(temp))
                setDiff2.add(temp);
        }

        iterator = setA.iterator();
        while (iterator.hasNext())
            setUnion.add(iterator.next());

        iterator = setB.iterator();
        while (iterator.hasNext())
            setUnion.add(iterator.next());

        System.out.println("A ∩ B = " + setInter);
        System.out.println("A ∪ B = " + setUnion);
        System.out.println("A - B = " + setDiff1);
        System.out.println("B - A = " + setDiff2);
    }
}

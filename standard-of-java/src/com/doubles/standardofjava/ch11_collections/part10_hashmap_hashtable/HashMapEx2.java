package com.doubles.standardofjava.ch11_collections.part10_hashmap_hashtable;

import java.util.*;

public class HashMapEx2 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("doubleS", new Integer(95));
        map.put("doubleA", new Integer(88));
        map.put("doubleB", new Integer(72));
        map.put("doubleC", new Integer(66));
        map.put("doubleD", new Integer(80));
        map.put("doubleE", new Integer(80));

        Set set = map.entrySet();
        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println("name : " + entry.getKey() + ", score : " + entry.getValue());
        }

        set = map.keySet();
        System.out.println("name list : " + set);

        Collection values = map.values();
        iterator = values.iterator();

        int total = 0;

        while (iterator.hasNext()) {
            Integer i = (Integer) iterator.next();
            total += i.intValue();
        }

        System.out.println("sum :" + total);
        System.out.println("average : " + (float) total / set.size());
        System.out.println("max : " + Collections.max(values));
        System.out.println("min : " + Collections.min(values));
    }
}

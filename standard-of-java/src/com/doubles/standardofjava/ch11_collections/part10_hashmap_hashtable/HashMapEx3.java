package com.doubles.standardofjava.ch11_collections.part10_hashmap_hashtable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx3 {

    static HashMap phoneBook = new HashMap();

    public static void main(String[] args) {
        addPhoneNo("friends", "kim", "010-1111-1234");
        addPhoneNo("friends", "yoon", "010-1234-1234");
        addPhoneNo("friends", "seo", "010-4321-4321");
        addPhoneNo("friends", "lee", "010-1100-7890");
        addPhoneNo("company", "choi", "010-0000-1010");
        addPhoneNo("company", "jung", "010-3333-4444");
        addPhoneNo("company", "park", "010-1111-1234");
        addPhoneNo("market", "070-1121-5432");

        printList();
    }

    static void addGroup(String groupName) {
        if (!phoneBook.containsKey(groupName))
            phoneBook.put(groupName, new HashMap());
    }

    static void addPhoneNo(String groupName, String name, String tel) {
        addGroup(groupName);
        HashMap group = (HashMap) phoneBook.get(groupName);
        group.put(tel, name);
    }

    static void addPhoneNo(String name, String tel) {
        addPhoneNo("etc", name, tel);
    }

    static void printList() {
        Set set = phoneBook.entrySet();
        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();

            Set subSet = ((HashMap) entry.getValue()).entrySet();
            Iterator subIterator = subSet.iterator();

            System.out.println(" * " + entry.getKey() + "[" + subSet.size() + "]");

            while (subIterator.hasNext()) {
                Map.Entry subEntry = (Map.Entry) subIterator.next();
                String telNo = (String) subEntry.getKey();
                String name = (String) subEntry.getValue();
                System.out.println(name + " " + telNo);
            }
            System.out.println();
        }
    }
}

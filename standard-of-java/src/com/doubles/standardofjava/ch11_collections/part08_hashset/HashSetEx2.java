package com.doubles.standardofjava.ch11_collections.part08_hashset;

import java.util.HashSet;

public class HashSetEx2 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("abc");
        hashSet.add("abc");
        hashSet.add(new Person("Doubles", 10));
        hashSet.add(new Person("Doubles", 10));

        System.out.println(hashSet);
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + ":" + age;
    }
}
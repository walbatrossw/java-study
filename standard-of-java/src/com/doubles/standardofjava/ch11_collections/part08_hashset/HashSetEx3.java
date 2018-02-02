package com.doubles.standardofjava.ch11_collections.part08_hashset;

import java.util.HashSet;
import java.util.Objects;


public class HashSetEx3 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("abc");
        hashSet.add("abc");
        hashSet.add(new Person2("Doubles", 10));
        hashSet.add(new Person2("Doubles", 10));

        System.out.println(hashSet);
    }
}

class Person2 {
    String name;
    int age;

    Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Person2) {
            Person2 temp = (Person2) obj;
            return name.equals(temp.name) && age == temp.age;
        }

        return false;
    }

    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String toString() {
        return name + ":" + age;
    }
}

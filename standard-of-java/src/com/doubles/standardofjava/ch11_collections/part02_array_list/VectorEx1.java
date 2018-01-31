package com.doubles.standardofjava.ch11_collections.part02_array_list;

import java.util.Vector;

public class VectorEx1 {
    public static void main(String[] args) {
        Vector vector = new Vector(5);
        vector.add("1");
        vector.add("2");
        vector.add("3");
        print(vector);

        System.out.println();

        vector.trimToSize();
        System.out.println("after trimToSize()");
        print(vector);

        System.out.println();

        vector.ensureCapacity(6);
        System.out.println("after ensureCapacity()");
        print(vector);

        System.out.println();

        vector.setSize(7);
        System.out.println("after setSize()");
        print(vector);

        System.out.println();

        vector.clear();
        System.out.println("after clear()");
        print(vector);

    }

    public static void print(Vector vector) {
        System.out.println(vector);
        System.out.println("size : " + vector.size());
        System.out.println("capacity : " + vector.capacity());
    }
}

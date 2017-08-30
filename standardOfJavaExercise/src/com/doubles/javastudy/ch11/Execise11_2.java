package com.doubles.javastudy.ch11;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

// 컬렉션의 특징 이해
public class Execise11_2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(3);
        list.add(6);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(7);

        HashSet hashSet = new HashSet(list);    // 중복요소 제거, 순서유지 X
        System.out.println("hashSet = " + hashSet);
        TreeSet treeSet = new TreeSet(hashSet); // 오름차순 정렬
        System.out.println("treeSet = " + treeSet);
        Stack stack = new Stack();          // Stack에 넣었다 꺼내면 저장순서가 반대
        stack.addAll(treeSet);              // TreeSet에 저장된 요소를 stack에 담는다.

        while (!stack.empty()) {
            System.out.println(stack.pop());// stack에 저장된 값을 하나씩 꺼낸다.
        }
    }
}

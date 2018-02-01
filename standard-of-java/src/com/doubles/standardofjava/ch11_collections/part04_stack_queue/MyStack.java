package com.doubles.standardofjava.ch11_collections.part04_stack_queue;

import java.util.EmptyStackException;
import java.util.Vector;

public class MyStack extends Vector {

    public Object push(Object item) {
        addElement(item);
        return item;
    }

    public Object pop() {
        Object obj = peek(); // stack에 저장된 마지막 요소를 읽어옴, stack이 비어있으면 EmptyStackException 발생
        removeElementAt(size() - 1);    // 마지막 요소삭제, 0부터시작하기 때문에 1을 빼줌
        return obj;
    }

    public Object peek() {
        int length = size();
        if (length == 0) {
            throw new EmptyStackException();
        }
        // 마지막 요소를 반환, 배열의 인덱스가 0부터 시작하기 때문에 1을 빼줌
        return elementAt(length - 1);
    }

    public boolean empty() {
        return size() == 0;
    }

    public int search(Object o) {
        int i = lastIndexOf(o); // 끝에서부터 객체를 찾는다.
        // 반환값은 저장된 위치(배열의 인덱스)
        if (i >= 0) {
            return size() - i;
        }
        // 객체를 찾지 못했을 경우 -1 반환
        return - 1;
    }
}

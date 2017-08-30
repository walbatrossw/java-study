package com.doubles.javastudy.ch11.collection.stacknqueue;

import java.util.EmptyStackException;
import java.util.Vector;

// 스택 직접 구현해보기
public class MyStack extends Vector {

    // 저장
    public Object push(Object item) {
        addElement(item);
        return item;
    }

    // 추출
    public Object pop() {
        // stack에 저장된 마지막요소를 읽어온다.
        Object obj = peek();
        // 만일 stack이 비어있으면 peek 메서드가 EmptyStackException를 발생
        // 마지막 요소를 삭제, 배열의 index가 0부터 시작하므로 1을 빼준다.
        removeElement(size() - 1);
        return obj;
    }

    // 마지막요소 읽기
    public Object peek() {
        int len = size();
        // stack이 비어있으면 EmptyStackException발생
        if (len == 0) {
            throw new EmptyStackException();
        }
        // 마지막 요소를 반환한다. 배열의 index가 0부터 시작하므로 1을 빼준다.
        return elementAt(len - 1);
    }

    public boolean empty() {
        return size() == 0;
    }

    public int search(Object o) {
        int i = lastIndexOf(o); // 끝에서부터 객체를 찾는다.
        // 반환값은 지정된 위치(배열의 index)이다.
        if (i >= 0) {   // 객체를 찾은 경우
            return size() - i;  // Stack은 맨위에 저장된 객체의 index를 1로 정의하기 때문에 계산을 통해 구한다.
        }
        return -1;  // 해당 객체를 찾지 못하면 -1를 반환
    }
}

package com.doubles.javastudy.ch11.collection.stacknqueue;

import java.util.Stack;

// 스택 예제
// 브라우저 "뒤로", "앞으로" 구현해보기
public class StackEx01 {

    public static Stack back = new Stack(); // 뒤로
    public static Stack forward = new Stack(); // 앞으로

    public static void main(String[] args) {
        goURL("www.naver.com");
        goURL("www.google.com");
        goURL("www.daum.com");

        printStatus();

        goBack();
        System.out.println("뒤로 가기 버튼 클릭!");
        printStatus();

        goBack();
        System.out.println("뒤로 가기 버튼 클릭!");
        printStatus();

        goForward();
        System.out.println("앞으로 버튼 클릭");
        printStatus();

        goURL("github.com");
        System.out.println("새로운 주소로 이동 버튼 클릭");
        printStatus();
    }

    // 현재 화면 보여주기
    public static void printStatus() {
        System.out.println("back : " + back);
        System.out.println("forward : " + forward);
        System.out.println("현재화면은 " + back.peek() + " 입니다.");
        System.out.println();
    }

    // 주소 추가
    public static void goURL(String url) {
        back.push(url);
        if (!forward.empty()) {
            forward.clear();
        }
    }

    // 앞으로 가기
    public static void goForward() {
        if (!forward.empty()){
            back.push(forward.pop());
        }

    }

    // 뒤로 가기
    public static void goBack() {
        if (!back.empty()){
            forward.push(back.pop());
        }
    }
}

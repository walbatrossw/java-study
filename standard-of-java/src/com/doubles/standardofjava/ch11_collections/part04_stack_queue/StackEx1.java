package com.doubles.standardofjava.ch11_collections.part04_stack_queue;

import java.util.Stack;

public class StackEx1 {

    public static Stack back = new Stack();
    public static Stack forward = new Stack();

    public static void main(String[] args) {
        goURL("1.naver");
        goURL("2.google");
        goURL("3.daum");
        goURL("4.youtube");

        printStatus();

        goBack();
        System.out.println("뒤로가기 버튼 클릭");
        printStatus();

        goBack();
        System.out.println("뒤로 버튼 클릭");
        printStatus();

        goForward();
        System.out.println("앞으로 버튼 클릭");
        printStatus();

        goURL("github.com");
        System.out.println("새로운 주소 이동");
        printStatus();
    }

    public static void printStatus() {
        System.out.println("back : " + back);
        System.out.println("forward : " + forward);
        System.out.println("현재화면은 " + back.peek() + "입니다.");
        System.out.println();
    }

    public static void goURL(String url) {
        back.push(url);
        if (!forward.empty())
            forward.clear();
    }

    public static void goForward() {
        if (!forward.empty())
            back.push(forward.pop());
    }

    public static void goBack() {
        if (!back.empty())
            forward.push(back.pop());
    }
}

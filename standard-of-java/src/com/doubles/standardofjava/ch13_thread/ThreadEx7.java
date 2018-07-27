package com.doubles.standardofjava.ch13_thread;

import javax.swing.*;

public class ThreadEx7 {
    public static void main(String[] args) {
        ThreadEx7_1 t1 = new ThreadEx7_1();
        t1.start();

        String input = JOptionPane.showInputDialog("아무 값이나 입력해주세요.");
        System.out.println("입력하신 값은 " + input + " 입니다.");
    }
}

class ThreadEx7_1 extends Thread {
    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
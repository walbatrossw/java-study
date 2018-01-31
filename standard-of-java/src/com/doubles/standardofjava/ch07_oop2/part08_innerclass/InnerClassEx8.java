package com.doubles.standardofjava.ch07_oop2.part08_innerclass;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerClassEx8 {
    public static void main(String[] args) {
        Button button = new Button("start");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent occurred!");
            }
        });
    }
}

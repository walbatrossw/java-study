package com.doubles.standardofjava.ch11_collections.part04_stack_queue;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx1 {

    static Queue queue = new LinkedList();
    static final int MAX_SIZE = 5;

    public static void main(String[] args) {
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");

        while (true) {
            System.out.print(">>");
            try {

                Scanner scanner = new Scanner(System.in);
                String input = scanner.nextLine().trim();

                if ("".equals(input))
                    continue;

                if (input.equalsIgnoreCase("q")) {
                    System.exit(0);
                } else if (input.equalsIgnoreCase("help")) {
                    System.out.println("help - 도움말을 보여줍니다.");
                    System.out.println("q 또는 Q - 프로그램을 종료합니다.");
                    System.out.println("history - 최근에 입력한 명령어를 " + MAX_SIZE +" 개 보여줍니다.");
                } else if (input.equalsIgnoreCase("history")) {
                    int i = 0;
                    save(input);

                    LinkedList temp = (LinkedList) queue;
                    ListIterator listIterator = temp.listIterator();

                    while (listIterator.hasNext()) {
                        System.out.println(++i+"."+listIterator.next());
                    }
                } else {
                    save(input);
                    System.out.println(input);
                }

            } catch (Exception e) {
                System.out.println("입력오류입니다.");
            }
        }
    }

    public static void save(String input) {
        if (!"".equals(input))
            queue.offer(input);

        if (queue.size() > MAX_SIZE)
            queue.remove();
    }
}

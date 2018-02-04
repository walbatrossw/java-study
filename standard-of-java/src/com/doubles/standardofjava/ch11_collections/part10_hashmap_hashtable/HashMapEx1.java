package com.doubles.standardofjava.ch11_collections.part10_hashmap_hashtable;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("doubles", "1234");
        map.put("doublek", "1111");
        map.put("doublek", "1234");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("id와 pw를 입력해주세요");
            System.out.print("id : ");
            String id = scanner.nextLine().trim();

            System.out.print("pw : ");
            String pw = scanner.nextLine().trim();
            System.out.println();

            if (!map.containsKey(id)) {
                System.out.println("입력한 id는 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            } else {
                if (!(map.get(id)).equals(pw)) {
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                } else {
                    System.out.println("id와 pw가 일치합니다.");
                    break;
                }
            }
        }
    }
}

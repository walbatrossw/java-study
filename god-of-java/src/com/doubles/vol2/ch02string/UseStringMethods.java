package com.doubles.vol2.ch02string;

public class UseStringMethods {
    public static void main(String[] args) {
        String text = "The String class represents character strings";

        UseStringMethods methods = new UseStringMethods();
        //methods.printWords(text);
        //methods.findString(text, "string");
        //methods.findAnyCaseString(text, "string");
        methods.countChar(text, 's');
        methods.printContainWords(text, "ss");
    }

    // 문자열 자르기
    private void printWords(String str) {
        String[] text = str.split(" ");
        for (String word : text) {
            System.out.println(word);
        }
    }

    // 문자열 특정 인덱스 반환 1 : indexOf
    private void findString(String str, String findStr) {
        int index = str.indexOf(findStr);
        System.out.println("string is appeared at " + index);
    }

    // 대소문자 구분없이 문자열 특정 인덱스 반환 2 : indexOf, toLowerCase
    private void findAnyCaseString(String str, String findStr) {
        int index = str.toLowerCase().indexOf(findStr);
        System.out.println("string is appeared at " + index);
    }

    // 문자열의 특정 문자의 갯수 카운트
    private void countChar(String str, char c) {
        int count = 0;
        char[] charArr = str.toCharArray();
        for (char a : charArr) {
            if (a == c) {
                count++;
            }
        }
        System.out.println("char 's' count is " + count);
    }

    // 특정 문자열이 포함되있는지 탐색
    private void printContainWords(String str, String findStr) {
        String[] text = str.split(" ");
        for (String word : text) {
            if (word.contains(findStr)) {
                System.out.println(word + " contains " + findStr);
            }
        }
    }
}

package com.doubles.vol2.ch02string;

import java.nio.charset.StandardCharsets;

public class StringSample {
    public static void main(String[] args) {
        StringSample sample = new StringSample();
        //System.out.println(sample.nullCheck(null));
        //sample.constructors();
        //sample.stringLengthAndIsEmpty();
        //sample.equalCheck();
        //sample.compareToCheck();
        //sample.addressCheck();
        //sample.matchCheck();
        //sample.indexOfCheck();
        //sample.lastIndexOfCheck();
        //sample.substringCheck1();
        //sample.splitCheck();
        //sample.trimCheck();
        //sample.replaceCheck();
        //sample.formatCheck();
        sample.caseCheck();
    }

    private void constructors() {
        try {
            String str = "한글";  // 한글이라는 값을 갖는 String 객체 str 생성

            byte[] array1 = str.getBytes();     // str을 byte배열로 변환
            printByteArray(array1);
            String str1 = new String(array1);   // byte 배열을 가진 String 객체 생성
            System.out.println(str1);

            byte[] array2 = str.getBytes();     // str을 byte배열로 변환
            printByteArray(array2);
            String str2 = new String(array2, "EUC-KR"); // EUC-KR로 캐릭터 셋 변환
            System.out.println(str2);

            byte[] array3 = str.getBytes(StandardCharsets.UTF_16);
            printByteArray(array3);
            String str3 = new String(array3, StandardCharsets.UTF_16);
            System.out.println(str3);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // byte 값 출력
    private void printByteArray(byte[] array1) {
        for (byte data : array1) {
            System.out.print(data + ", ");
        }
    }

    // null 체크
    private boolean nullCheck(String text) {
        int textLength = text.length();
        System.out.println(textLength);
        return text == null;
    }

    // 문자열 길이, 문자열 공백 확인
    private void stringLengthAndIsEmpty() {
        String text = "You must know String class.";
        System.out.println("text.length() = " + text.length()); // 문자열 길이 반환
        System.out.println("text.isEmpty() = " + text.isEmpty()); // 문자열 비어있는지 확인
    }

    // 문자열 비교 : equals(), equalsIgnoreCase()
    private void equalCheck() {
        String text = "Check value";    // Constant Pool : 객체를 재사용하기 위해
        String text2 = "Check value";   // String 동일한 값이 존재하면 객체를 재사용
        String text3 = "Check value"; // 새로운 객체 사용
        String text4 = "check value";   // 소문자
        if (text == text2) {
            System.out.println("text == text2 result is same.");
        } else {
            System.out.println("text == text2 result is different.");
        }
        if (text == text3) {
            System.out.println("text == text3 result is same.");
        } else {
            System.out.println("text == text3 result is different.");
        }
        if (text.equals("Check value")) {
            System.out.println("text.equals(text2) result is same.");
        }
        if (text.equalsIgnoreCase(text4)) {
            System.out.println("text.equalsIgnoreCase(text4) result is same.");
        }
    }

    // 문자열 비교 : compareTo
    private void compareToCheck() {
        String a = "a";
        String b = "b";
        String c = "c";
        String a2 = "a";

        System.out.println(b.compareTo(a));
        System.out.println(b.compareTo(c));
        System.out.println(a.compareTo(c));
        System.out.println(a.compareTo(a2));
    }

    // 특정 조건의 문자열 탐색
    private void addressCheck() {
        String[] addresses = new String[]{
                "서울시 강남구 대치동",
                "서울시 강남구 논현동",
                "서울시 서초구 서초동",
        };

        int startCount = 0;
        int endCount = 0;
        int containCount = 0;
        String startText = "서울시";
        String endText = "동";
        String containText = "강남";

        for (String address : addresses) {
            if (address.startsWith(startText)) {
                startCount++;
            }
            if (address.endsWith(endText)) {
                endCount++;
            }
            if (address.contains(containText)) {
                containCount++;
            }
        }

        System.out.println("Starts with " + startText + ". count is " + startCount +".");
        System.out.println("Ends with " + endText + ". count is " + endCount +".");
        System.out.println("Contains with " + containText + ". count is " + containCount +".");
    }

    // 문자열의 특정 영역에서 매개변수로 넘어온 문자열과 동일한지 확인
    private void matchCheck() {
        String text = "This is a text.";
        String compare1 = "is";
        String compare2 = "This";
        System.out.println(text.regionMatches(2, compare1, 0, 1));
        System.out.println(text.regionMatches(5, compare1, 0, 2));
        System.out.println(text.regionMatches(true, 0, compare2, 0, 4));
    }

    // 문자열의 특정 위치 반환 : 처음부터 탐색
    public void indexOfCheck() {
        String text = "Java technology is both a programming language and a platform.";
        System.out.println(text.indexOf('a'));
        System.out.println(text.indexOf("a "));
        System.out.println(text.indexOf('a', 20));
        System.out.println(text.indexOf("a ", 20));
        System.out.println(text.indexOf('z'));
    }

    // 문자열의 특정 위치 반환 : 뒤부터 탐색
    public void lastIndexOfCheck() {
        String text = "Java technology is both a programming language and a platform.";
        System.out.println(text.lastIndexOf('a'));
        System.out.println(text.lastIndexOf("a "));
        System.out.println(text.lastIndexOf('a', 20));
        System.out.println(text.lastIndexOf("a ", 20));
        System.out.println(text.lastIndexOf('z'));
    }

    // 문자열 추출
    private void substringCheck1() {
        String text = "Java technology";
        String technology = text.substring(5);
        System.out.println(technology);
        String tech = text.substring(5, 9);
        System.out.println(tech);
    }

    // 문자열을 자르고 배열 저장
    private void splitCheck() {
        String text = "Java technology is both a programming language and a platform.";
        String[] splitArray = text.split(" ");
        for (String temp : splitArray) {
            System.out.println(temp);
        }
    }

    // 문자열 공백 체크
    private void trimCheck() {
        String[] strings = new String[] {
                " a", " b ", "    c", "d     ", "e   f", "   "
        };
        for (String string : strings) {
            System.out.println("before Trim [" + string + "]");
            System.out.println("after Trim [" + string.trim() + "]");
        }
    }

    // 문자열 교체
    private void replaceCheck() {
        String text = "The string class represents character strings.";
        System.out.println(text.replace('s', 'z'));
        System.out.println(text);
        System.out.println(text.replace("tring", "trike"));
        System.out.println(text.replaceAll(" ", "|"));
        System.out.println(text.replaceFirst(" ", "|"));
    }

    // 문자열 치환
    private void formatCheck() {
        String text = "제 이름은 %s입니다. 지금까지 %d개의 프로젝트를 진행했고, "
                + "하루에 %f %%의 시간을 프로젝트를 진행하는데 할애하고 있습니다.";
        String realText = String.format(text, "더블에스", 4, 10.5);
        System.out.println(realText);
    }

    // 대소문자 변환
    private void caseCheck() {
        String text = "ABCDEFG";
        System.out.println(text.toLowerCase());
        String text2 = "abcdefg";
        System.out.println(text2.toUpperCase());
    }
}

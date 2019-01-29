package com.doubles.vol2.ch03lang;

public class JavaLang {
    public static void main(String[] args) {
        JavaLang lang = new JavaLang();
        //lang.numberCheck();
        //lang.numberTypeCheck();
        //lang.numberMinMaxCheck();
        //lang.integerMinMaxCheck();
        //lang.systemPropertiesCheck();
        //lang.methodRunningTimeCheck();
        //lang.printStreamCheck();
        //lang.printNull();
        //lang.mathCheck();
        //lang.mathCheck2();
        //lang.mathCheck3();
        lang.mathCheck4();
    }

    // 문자열 숫자 변환
    private void numberCheck() {
        // String 변수 선언
        String val1 = "3";
        String val2 = "5";

        // String 값을 byte 변환
        byte byte1 = Byte.parseByte(val1);
        byte byte2 = Byte.parseByte(val2);
        System.out.println(byte1 + byte2); // 8

        // String 값을 Integer 변환
        Integer refInt1 = Integer.valueOf(val1);
        Integer refInt2 = Integer.valueOf(val2);
        System.out.println(refInt1 + refInt2 + "7"); // 87
    }

    // 참조 자료형 : 숫자를 나타내기 위한 Byte, Short, Integer, Long, Float, Double은 필요시 기본자료형처럼 사용 가능
    private void numberTypeCheck() {
        Integer refInt;
        refInt = 100;
        System.out.println(refInt.doubleValue());
    }

    // 슷지 참조 타입의 최소, 최대값 출력
    private void numberMinMaxCheck() {
        System.out.println("Byte min = " + Byte.MIN_VALUE + " max = " + Byte.MAX_VALUE);
        System.out.println("Short min = " + Short.MIN_VALUE + " max = " + Short.MAX_VALUE);
        System.out.println("Integer min = " + Integer.MIN_VALUE + " max = " + Integer.MAX_VALUE);
        System.out.println("Long min = " + Long.MIN_VALUE + " max = " + Long.MAX_VALUE);
        System.out.println("Float min = " + Float.MIN_VALUE + " max = " + Float.MAX_VALUE);
        System.out.println("Double min = " + Double.MIN_VALUE + " max = " + Double.MAX_VALUE);
        System.out.println("Character min = " + (int) Character.MIN_VALUE + " max = " + (int) Character.MAX_VALUE);
    }

    // 진수 변환
    private void integerMinMaxCheck() {
        // 2진수 변환
        System.out.println("Integer BINARY min = " + Integer.toBinaryString(Integer.MIN_VALUE));
        System.out.println("Integer BINARY max = " + Integer.toBinaryString(Integer.MAX_VALUE));

        // 16진수 변환
        System.out.println("Integer HEX min = " + Integer.toHexString(Integer.MIN_VALUE));
        System.out.println("Integer HEX max = " + Integer.toHexString(Integer.MAX_VALUE));
    }

    // 시스템 속성 반환 : 자바 버전 확인
    private void systemPropertiesCheck() {
        System.out.println("java.version = " + System.getProperty("java.version"));
        System.out.println("JAVA_HOME = " + System.getenv("JAVA_HOME"));
    }

    // 메서드 수행시간 계산
    private void methodRunningTimeCheck() {
        long startTime = System.currentTimeMillis();
        long startNanoTime = System.nanoTime();
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("1 ~ 100 sum = " + sum);
        System.out.println("Milli second = " + (System.currentTimeMillis() - startTime));
        System.out.println("Nano second = " + (System.nanoTime() - startNanoTime));
    }

    // System.out
    private void printStreamCheck() {
        byte b = 127;
        short s = 32767;
        System.out.println(b);
        System.out.println(s);
        printInt(b);
        printInt(s);
    }

    private void printInt(int value) {
        System.out.println(value);
    }

    private void printNull() {
        Object obj = null;
        System.out.println(obj);
        System.out.println(obj + " is object's value.");
        //System.out.println(obj.toString()); // NullPointException 발생
    }

    // Math : 절대값, 부호 확인, 최대/최소값
    private void mathCheck() {
        double num1 = 45;
        double num2 = -45;

        System.out.println("Math.ads(45) = " + Math.abs(num1));
        System.out.println("Math.ads(-45) = " + Math.abs(num2));

        System.out.println("Math.signum(45) = " + Math.signum(num1));
        System.out.println("Math.signum(-45) = " + Math.signum(num2));

        System.out.println("Math.min(45, -45) = " + Math.min(num1, num2));
        System.out.println("Math.max(45, -45) = " + Math.max(num1, num2));
    }

    // Math : 반올림, 올림, 버림
    private void mathCheck2() {
        double[] numbers = new double[] {
                3.15,
                3.62,
                -3.15,
                -3.62
        };
        for (double number : numbers) {
            System.out.println(number);
            System.out.print("Math.round() = " + Math.round(number) + ", ");    // 반올림
            System.out.print("Math.rint() = " + Math.rint(number) + ", ");      // 반올림
            System.out.print("Math.ceil() = " + Math.ceil(number) + ", ");      // 올림
            System.out.print("Math.floor() = " + Math.floor(number));           // 버림
            System.out.println();
        }
    }

    // Math : 제곱근 계산
    private void mathCheck3() {
        System.out.println("Math.sqrt(1) = " + Math.sqrt(1));           // 매개변수 제곱근
        System.out.println("Math.sqrt(2) = " + Math.sqrt(2));
        System.out.println("Math.cbrt(8) = " + Math.cbrt(8));           // 매개변수 세제곱
        System.out.println("Math.cbrt(27) = " + Math.cbrt(27));
        System.out.println("Math.pow(2, 2) = " + Math.pow(2, 2));       // 두번째 매개변수만큼 제곱근 계산
        System.out.println("Math.scalb(2, 4) = " + Math.scalb(2, 4));   // 첫번째 매개변수 * 2^ 두번째 매개변수
        System.out.println("Math.hypot(3, 4) = " + Math.hypot(3, 4));   // 매개변수들의 제곱근 합
        System.out.println("Math.sqrt(Math.pow(3, 2) + Math.pow(4, 2)) = " + Math.sqrt(Math.pow(3, 2) + Math.pow(4, 2)));
    }

    // Math : 삼각함수
    private void mathCheck4() {
        double num1 = 45;
        double num2 = 90;

        double radian45 = Math.toRadians(num1);
        double radian90 = Math.toRadians(num2);
        System.out.println("Radian value of 45 degree is " + radian45);
        System.out.println("Radian value of 90 degree is " + radian90);
        System.out.println("Math.sin(45 degree) = " + Math.sin(radian45));
        System.out.println("Math.sin(90 degree) = " + Math.sin(radian90));
        System.out.println("Math.sin(45 degree) = " + Math.cos(radian45));
        System.out.println("Math.cos(90 degree) = " + Math.tan(radian90));
        System.out.println("Math.tan(45 degree) = " + Math.tan(radian45));
        System.out.println("Math.tan(90 degree) = " + Math.tan(radian90));
    }
}

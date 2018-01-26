package com.doubles.standardofjava.ch08_exceptions;

public class NewExceptionTest {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException se) {
            System.out.println("에러메시지 : " + se.getMessage());
            se.printStackTrace();
            System.out.println("공간을 확보해주세요.");
        } catch (MemoryException me) {
            System.out.println("에러메시지 : " + me.getMessage());
            me.printStackTrace();
            System.out.println("메모리가 부족합니다.");
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws SpaceException, MemoryException {
        if (!enoughSpace())
            throw new SpaceException("설치공간부족");
        if (!enoughMemory())
            throw new MemoryException("메모리부족");
    };

    static void copyFiles() {};

    static void deleteTempFiles() {};

    static boolean enoughSpace() {
        // 설치 공간이 충분한지 판단하는 코드 작성
        return false;
    };
    static boolean enoughMemory() {
        // 설치 메모리가 충분한지 판단하는 코드 작성
        return true;
    };
}

class SpaceException extends Exception {
    SpaceException(String msg) {
        super(msg);
    }
}

class MemoryException extends Exception {
    MemoryException(String msg) {
        super(msg);
    }
}
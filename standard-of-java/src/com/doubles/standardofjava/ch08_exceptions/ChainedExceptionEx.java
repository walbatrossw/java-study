package com.doubles.standardofjava.ch08_exceptions;

public class ChainedExceptionEx {
    public static void main(String[] args) {
        try {
            install();
        } catch (InstallException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void install() throws InstallException {
        try {
            startIinstall();
            copyFiles();
        } catch (SpaceException2 se) {
            InstallException ie = new InstallException("설치 중 예외발생");
            ie.initCause(se);
            throw ie;
        } catch (MemoryException2 me) {
            InstallException ie = new InstallException("설치 중 예외발생");
            ie.initCause(me);
            throw ie;
        } finally {
            deleteTempFile();
        }
    };

    static void startIinstall() throws SpaceException2, MemoryException2 {
        if (!enoughSpace())
            throw new SpaceException2("설치 공간 부족");
        if (!enoughMemory())
            throw new MemoryException2("메모리 부족");
    };

    static void copyFiles() {};

    static void deleteTempFile() {};

    static boolean enoughSpace() {
        return false;
    };

    static boolean enoughMemory() {
        return true;
    };

}

class InstallException extends Exception {
    InstallException(String msg) {
        super(msg);
    }
}

class SpaceException2 extends Exception {
    SpaceException2(String msg) {
        super(msg);
    }
}

class MemoryException2 extends Exception {
    MemoryException2(String msg) {
        super(msg);
    }
}



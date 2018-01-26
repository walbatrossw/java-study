package com.doubles.standardofjava.ch08_exceptions;

public class FinallyTest2 {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() {};
    static void copyFiles() {};
    static void deleteTempFiles() {};
}

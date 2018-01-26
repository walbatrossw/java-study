package com.doubles.standardofjava.ch08_exceptions;

import java.io.File;

public class ExceptionEx15 {
    public static void main(String[] args) {
        String fileName = "";
        File file = createFile(fileName);
        System.out.println(file.getName() + "파일이 성공적으로 생성됨.");
    }

    static File createFile(String fileName) {
        try {
            if (fileName == null || fileName.equals(""))
                throw new Exception("파일이름이 유효하지 않음.");
        } catch (Exception e) {
            fileName = "제목없음.txt";
        } finally {
            File file = new File(fileName);
            createNewFile(file);
            return file;
        }
    }

    static void createNewFile(File file) {
        try {
            file.createNewFile();
        } catch (Exception e) {

        }
    }
}

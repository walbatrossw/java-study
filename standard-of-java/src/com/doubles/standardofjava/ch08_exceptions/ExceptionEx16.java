package com.doubles.standardofjava.ch08_exceptions;

import java.io.File;

public class ExceptionEx16 {
    public static void main(String[] args) {
        String fileName = "";
        try {
            File file = createFile(fileName);
            System.out.println(file.getName() + "파일이 성공적으로 생성됨.");
        } catch (Exception e) {
            System.out.println(e.getMessage() + "파일명 재확인 요망.");
        }
    }

    static File createFile(String fileName) throws Exception {
        if (fileName == null || fileName.equals(""))
            throw new Exception("파일이름이 유효하지 않음. ");
        File file = new File(fileName);
        file.createNewFile();
        return file;
    }

}

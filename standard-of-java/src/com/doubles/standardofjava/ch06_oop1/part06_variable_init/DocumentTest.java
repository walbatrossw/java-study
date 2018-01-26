package com.doubles.standardofjava.ch06_oop1.part06_variable_init;

public class DocumentTest {
    public static void main(String[] args) {

        Document d1 = new Document();
        Document d2 = new Document();
        Document d3 = new Document("자바.txt");
        Document d4 = new Document();
        Document d5 = new Document("자바스크립트.txt");
        Document d6 = new Document("스프링.txt");
        Document d7 = new Document();

    }
}

class Document {
    static int count = 0;
    String name;

    Document() {
        this("제목없음" + ++count);
    }

    Document(String name) {
        this.name = name;
        System.out.println("문서 " + this.name + "가 생성됨.");
    }
}
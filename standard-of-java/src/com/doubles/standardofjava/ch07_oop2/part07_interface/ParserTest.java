package com.doubles.standardofjava.ch07_oop2.part07_interface;

public class ParserTest {
    public static void main(String[] args) {
        Parseable parseable = ParserManager.getParser("XML");
        parseable.parse("document.xml");
        parseable = ParserManager.getParser("HTML");
        parseable.parse("document2.html");
    }
}

interface Parseable {
    public abstract void parse(String fileName);
}

class ParserManager {
    public static Parseable getParser(String type) {
        if (type.equals("XML")) {
            return new XMLParser();
        } else {
            return new HTMLParser();
        }
    }
}

class XMLParser implements Parseable {

    public void parse(String fileName) {
        System.out.println(fileName + " - XML parsing completed");
    }
}

class HTMLParser implements Parseable {

    public void parse(String fileName) {
        System.out.println(fileName + " - HTML parsing completed");
    }
}
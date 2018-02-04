package com.doubles.standardofjava.ch11_collections.part12_properties;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesEx1 {
    public static void main(String[] args) {
        Properties properties = new Properties();

        properties.setProperty("timeout", "30");
        properties.setProperty("language", "kr");
        properties.setProperty("size", "10");
        properties.setProperty("capacity", "10");

        // properties에 저장된 요소들을 Enumeration을 이용해 출력
        Enumeration enumeration = properties.propertyNames();

        while (enumeration.hasMoreElements()) {
            String element = (String) enumeration.nextElement();
            System.out.println(element + "=" + properties.getProperty(element));
        }

        System.out.println();

        properties.setProperty("size", "20");
        System.out.println("size=" + properties.getProperty("size"));
        System.out.println("capacity=" + properties.getProperty("capacity", "20"));
        System.out.println("loadfactor=" + properties.getProperty("loadfactor", "0.75"));

        System.out.println(properties);

        System.out.println();

        properties.list(System.out);
    }
}

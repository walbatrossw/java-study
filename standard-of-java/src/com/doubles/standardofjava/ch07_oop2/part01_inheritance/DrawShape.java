package com.doubles.standardofjava.ch07_oop2.part01_inheritance;


public class DrawShape {
    public static void main(String[] args) {
        Point[] points = {new Point(100, 100), new Point(150, 200), new Point(120, 180)};
        Triangle triangle = new Triangle(points);
        Circle circle = new Circle(new Point(150, 100), 50);

        triangle.draw();
        circle.draw();
    }
}

class Shape {

    String color = "black";

    void draw() {
        System.out.printf("[color=%s]%n", color);
    }
}

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Point() {
        this(0, 0);
    }

    String getXY() {
        return "("+x+","+y+")";
    }
}

class Circle extends Shape {
    Point center;
    int r;

    Circle() {
        this(new Point(0,0), 100);
    }

    Circle(Point center, int r) {
        this.center = center;
        this.r = r;
    }

    void draw() {
        System.out.printf("[center=(%d, %d), r=%d, color=%s]%n", center.x, center.y, r, color);
    }
}

class Triangle extends Shape {
    Point[] points = new Point[3];

    Triangle(Point[] points) {
        this.points = points;
    }

    void draw() {
        System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n", points[0].getXY(), points[1].getXY(), points[2].getXY(), color);
    }
}

package com.company;

public class Shape {
    String type;
    int angles;
    int perimeter;
    int area;
    Shape(String type, int angles, int perimeter, int area){
        this.type=type;
        this.angles=angles;
        this.perimeter=perimeter;
        this.area=area;
    }

    public String toString() {
        return type + " " + angles + " " + perimeter + " " + area;
    }

    public static void main(String[] args){
        System.out.println("  Задание 1");
        Shape circle = new Shape("circle", 0, 12, 12);
        Shape triangle1 = new Shape("triangle1", 3, 24, 48);
        Shape square = new Shape("square", 4, 16, 16);
        Shape rectangle = new Shape("rectangle", 4, 22, 30);

        System.out.println(circle.toString());
        System.out.println(triangle1.toString());
        System.out.println(square.toString());
        System.out.println(rectangle.toString());
    }
}

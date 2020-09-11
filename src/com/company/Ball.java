package com.company;

public class Ball {
    String type;
    int size;
    String color;
    Ball(String type, int size, String color){
        this.type=type;
        this.size=size;
        this.color=color;
    }

    public String toString(){
        return type + " " + size + " " + color;
    }

    public static void main(String[] args){
        System.out.println("  Задание 2");
        Ball ball1 = new Ball("football", 56, "white");
        Ball ball2 = new Ball("basketball", 690, "orange");
        Ball ball3 = new Ball("volleyball", 250, "red");

        System.out.println(ball1.toString());
        System.out.println(ball2.toString());
        System.out.println(ball3.toString());
    }
}

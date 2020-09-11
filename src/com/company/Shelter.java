package com.company;
import java.util.*;

class Dog extends Shelter {
    String name;
    int age;
    Dog(String name, int age){
        this.name=name;
        this.age=age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int AgetoHuman() {
        int agetoHuman= this.age * 7;
        return agetoHuman;
    }

    public String toString(){
        return  "Name: " + name + "; age(dog):  " + age + "; age(human): " + AgetoHuman();
    }
}

public class Shelter {
    public ArrayList<Dog> dogs = new ArrayList<>();

    public void add_new(String name, int age){
        dogs.add(new Dog(name, age));
    }

    public void show_all(){
        for (Dog d: dogs){
            System.out.println(d.toString());
        }
    }

    public static void main(String[] args) {
        System.out.println("  Задание 4");
        Shelter shelter = new Shelter();
        shelter.add_new("Richie", 1);
        shelter.add_new("Otis", 2);
        shelter.add_new("Bella", 5);
        shelter.add_new("Bob", 8);
        shelter.add_new("Mia", 11);

        shelter.show_all();
    }
}
package com.company;

public class Book {
    String name;
    String author;
    String genre;
    Book(String name, String author,String genre){
        this.name=name;
        this.author=author;
        this.genre=genre;
    }

    public String toString(){
        return name + ", " + author + ", "  + genre;
    }

    public static void main(String[] args){
        System.out.println("  Задание 3");
        Book book1 = new Book("The Sea-Wolf", "Jack London", "novel");
        Book book2 = new Book("The Adventures of Tom Sawyer", "Mark Twain", "bildungsroman");
        Book book3 = new Book("The Adventures of Sherlock Holmes", "Arthur Conan Doyle", "detective fiction short stories");
        Book book4 = new Book("Through the Looking-Glass", "Lewis Carroll", "children's fiction");
        Book book5 = new Book("Treasure Island", "Robert Louis Stevenson", "adventure fiction");

        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());
        System.out.println(book4.toString());
        System.out.println(book5.toString());
    }
}

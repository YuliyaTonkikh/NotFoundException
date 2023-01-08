package ru.netology;

public class Book extends Product {
    private String autor;
    private String title;

    public Book(int id, String title, int cost, String autor, String name) {
        super(id, title, cost, name);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }
}
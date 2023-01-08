package ru.netology;

public class Product {
    protected int id;
    protected String title;
    protected int cost;
    protected String name;

    public Product(int id, String title, int cost, String name) {
        this.id = id;
        this.title = title;
        this.cost = cost;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

}

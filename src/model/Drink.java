package model;

public class Drink {
    private Long id;
    private Category category;
    private String name;
    private double price;

    public Drink() {
    }

    public Drink(Long id, Category category, String name, Long price) {
        this.id = id;
        this.category = category;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.id + ". " + this.category.getName() + " " + this.name + " " + this.price;
    }
}
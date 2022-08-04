package model;

public class Drink {
    private Long id;
    private Category category;
    private long price;
    public Drink() {
    }
    public Drink(Long id, Category category, int price) {
        this.id = id;
        this.category = category;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public Category getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return this.id + ". " + this.category.getName()  + " " + this.price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
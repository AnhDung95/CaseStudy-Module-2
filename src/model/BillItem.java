package model;

public class BillItem {

    private Long id;
    private Long billId;
    private Drink drink;
    private Integer quantity;
    private Long Price;

    public BillItem() {
    }

    public BillItem(Long id, Long billId, Drink drink, Integer quantity) {
        this.id = id;
        this.billId = billId;
        this.drink = drink;
        this.quantity = quantity;
        this.Price = Price;
    }

    public Drink getDrink() {
        return drink;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Long getPrice() {
        return Price;
    }

    public void setPrice(Long price) {
        this.Price = price;
    }
}
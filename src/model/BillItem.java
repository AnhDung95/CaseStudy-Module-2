package model;

public class BillItem {

    private Long id;
    private Long billId;
    private Drink drink;
    private Integer quantity;
    private Long Price;
    private Long totalPrice;

    public BillItem() {
    }

    public BillItem(Long id, Long billId, Drink drink, Integer quantity) {
        this.id = id;
        this.billId = billId;
        this.drink = drink;
        this.quantity = quantity;
        this.Price = Price;
        this.totalPrice=totalPrice;
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

    public Long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }
}
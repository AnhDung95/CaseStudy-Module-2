package model;

public class BillItem {

    private Long id;
    private Long billId;
    private Drink drink;
    private Integer quantity;

    public BillItem() {
    }

    public BillItem(Long id, Long billId, Drink drink, Integer quantity) {
        this.id = id;
        this.billId = billId;
        this.drink = drink;
        this.quantity = quantity;
    }
    public Drink getDrink() {
        return drink;
    }
    public Integer getQuantity() {
        return quantity;
    }
    public long getTotalPrice() {
        return quantity*drink.getPrice();
    }
}
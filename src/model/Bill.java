package model;

import view.OrderPage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bill {
    private Long id;
    private String date;
    private List<BillItem> items;
    public Staff staffName;
    private static ArrayList<Drink> drinkArrayList = new ArrayList<>();
    public Bill() {
    }

    public Bill(Long id) {
        this.id = id;
        this.date = LocalDate.now().toString();
    }

    public Long getId() {
        return id;
    }

    public void setItems(List<BillItem> items) {
        this.items = items;
    }

    public Staff getStaffName() {
        return staffName;
    }

    public void setStaffName(Staff staffName) {
        this.staffName = staffName;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder(this.id + "\n").append("Ngày: " + this.date + "\n").append("Nhân viên: "+this.staffName+"\n");
        for (BillItem d : this.items) {
            s.append("Số lượng: " + d.getQuantity()).append(" " + d.getDrink().getCategory().getName() +"\n");//append("Tổng tiền: "+);
        }

        return s.toString();
    }
}
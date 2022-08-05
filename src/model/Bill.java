package model;

import account.AccountAdmin;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bill implements Serializable {
    private Long id;
    private String date;
    private List<BillItem> items;
    public String staffName;
    private static ArrayList<Drink> drinkArray1List = new ArrayList<>();
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

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder(this.id + "\n").append("Ngày: " + this.date + "\n").append("Nhân viên: Nguyễn Anh Dũng"+"\n");
        for (BillItem d : this.items) {
            s.append("Số lượng: " + d.getQuantity()).append(" " + d.getDrink().getCategory().getName() +"\n");
        }
        return s.toString();
    }
}
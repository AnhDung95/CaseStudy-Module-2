package model;

import java.time.LocalDate;
import java.util.List;

public class Bill {
    private Long id;
    private String date;
    private List<BillItem> items;
    public Staff staffName;

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
        StringBuilder s = new StringBuilder("Hóa đơn số: " + this.id + "\n").append("Ngày: " + this.date + "\n").append("Nhân viên: "+this.staffName+"\n");
        for (BillItem d : this.items) {
            s.append(" " + d.getQuantity()).append(" " + d.getDrink().getName()).append("\n").append(" "+d.getPrice());
        }
        return s.toString();
    }
}
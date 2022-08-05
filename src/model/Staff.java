package model;

import account.AccountAdmin;

public class Staff {
    private Long id;
    private String name;

    public Staff() {
    }

    public Staff(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return getName();
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

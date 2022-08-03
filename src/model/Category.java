package model;

import java.util.List;

public class Category {
    private Long id;
    private String name;

    public Category() {
    }

    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public static Category COFFEE1 = new Category(1L, "Đen đá");
    public static Category COFFEE2 = new Category(2L, "Nâu đá");
    public static Category COFFEE3 = new Category(3L, "Bạc xỉu");
    public static Category TEA1 = new Category(4L, "Hồng trà sữa");
    public static Category TEA2 = new Category(5L, "Trà vải");
    public static Category TEA3 = new Category(6L, "Trà mạn");
    public static Category JUICE1 = new Category(3L, "Nước cam ép");
    public static Category JUICE2 = new Category(3L, "Nước táo ép");
    public static Category JUICE3 = new Category(3L, "Nước đào");

    public String getName() {
        return name;
    }
}

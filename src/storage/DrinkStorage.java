package storage;

import controller.DrinkController;
import model.Category;
import model.Drink;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class DrinkStorage implements Storage<Drink> {
    private static final DrinkStorage INSTANCE;

    private DrinkStorage() {
    }

    static {
        try {
            INSTANCE = new DrinkStorage();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static DrinkStorage getInstance() {
        return INSTANCE;
    }

    private List<Drink> menu = new ArrayList<>(asList(
            new Drink(1L, Category.COFFEE1, "Đen đá", 25000L),
            new Drink(2L, Category.COFFEE2, "Nâu đá", 30000L),
            new Drink(3L, Category.COFFEE3, "Bạc xỉu", 35000L),
            new Drink(4L, Category.TEA1, "Hồng trà sữa", 40000L),
            new Drink(5L, Category.TEA2, "Trà vải", 35000L),
            new Drink(6L, Category.TEA3, "Trà mạn", 30000L),
            new Drink(7L, Category.JUICE1, "Nước cam ép", 35000L),
            new Drink(8L, Category.JUICE2, "Nước táo ép", 35000L),
            new Drink(9L, Category.JUICE3, "Nước đào", 35000L)
    ));
    @Override
    public void store(Drink drink) {
        // write files
    }

    @Override
    public List<Drink> findAll() {
        // read file
        return this.menu;
    }

    public Drink findById(Long id) {
        for (Drink d : menu) {
            if (d.getId().equals(id)) return d;
        }
        return null;
    }
}
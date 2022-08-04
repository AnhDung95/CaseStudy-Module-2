package model;

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

    public static List<Drink> menu = new ArrayList<>(asList(
            new Drink(1L, Category.COFFEE1,25000),
            new Drink(2L, Category.COFFEE2,30000),
            new Drink(3L, Category.COFFEE3,35000),
            new Drink(4L, Category.TEA1,40000),
            new Drink(5L, Category.TEA2,35000),
            new Drink(6L, Category.TEA3,30000),
            new Drink(7L, Category.JUICE1,35000),
            new Drink(8L, Category.JUICE2,35000),
            new Drink(9L, Category.JUICE3,35000)
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
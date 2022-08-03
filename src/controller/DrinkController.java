package controller;

import model.Drink;
import model.DrinkStorage;

import java.util.List;

public class DrinkController {

    private final DrinkStorage drinkStorage = DrinkStorage.getInstance();
    private static final DrinkController INSTANCE;

    private DrinkController() {
    }

    static {
        try {
            INSTANCE = new DrinkController();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static DrinkController getInstance() {
        return INSTANCE;
    }

    public List<Drink> getMenu() {
        return drinkStorage.findAll();
    }

    public Drink findDrinkById(Long id) {
        return drinkStorage.findById(id);
    }
}
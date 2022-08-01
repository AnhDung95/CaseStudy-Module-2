package storage;

import model.Drink;

import java.util.List;

public class DrinkStorage implements Storage<Drink> {

    @Override
    public void store(Drink drink) {
        // write files
    }

    @Override
    public List<Drink> findAll() {
        // read file
        return null;
    }
}

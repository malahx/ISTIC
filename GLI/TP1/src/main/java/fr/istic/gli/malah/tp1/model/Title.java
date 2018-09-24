package fr.istic.gli.malah.tp1.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Title {
    private String name;
    private List<Item> items;
    private String unit;

    public void addItem(Item item) {
        if (items == null) {
            items = new ArrayList<>();
        }
        items.add(item);
    }
    public void remItem(Item item) {
        if (items == null) {
            items = new ArrayList<>();
        }
        items.remove(item);
    }
}

package fr.istic.gli.malah.tp1.adapter;

import fr.istic.gli.malah.tp1.model.Item;
import fr.istic.gli.malah.tp1.model.Title;

import java.util.List;

public interface TitleAdapter extends Observer<Title> {

    String GET_NAME = "title-get-name";
    String GET_ITEMS = "title-get-items";
    String SET_NAME = "title-set-name";
    String SET_ITEMS = "title-set-items";
    String ADD_ITEM = "title-add-item";
    String REM_ITEM = "title-rem-item";

    String getName();

    List<Item> getItems();

    void setName(String name);

    void setItems(List<Item> items);

    void addItem(Item item);

    void remItem(Item item);

    int size();

    float getValues(int i);

    double total();

    String getTitle();

    String getTitle(int i);

    String getUnit();

    String getDescription(int i);
}

package fr.istic.gli.malah.tp1.adapter.impl;

import fr.istic.gli.malah.tp1.adapter.TitleAdapter;
import fr.istic.gli.malah.tp1.model.Item;
import fr.istic.gli.malah.tp1.model.Title;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class TitleAdapterImpl extends ObserverImpl<Title> implements TitleAdapter {

    private Title title;

    @Override
    public String getName() {
        notifyListeners(Event.<Title>builder().object(title).type(GET_NAME).build());
        return title.getName();
    }

    @Override
    public List<Item> getItems() {
        notifyListeners(Event.<Title>builder().object(title).type(GET_ITEMS).build());
        return title.getItems();
    }

    @Override
    public void setName(String name) {
        title.setName(name);
        notifyListeners(Event.<Title>builder().object(title).type(SET_NAME).build());
    }

    @Override
    public void setItems(List<Item> items) {
        title.setItems(items);
        notifyListeners(Event.<Title>builder().object(title).type(SET_ITEMS).build());
    }

    @Override
    public void addItem(Item item) {
        title.addItem(item);
        notifyListeners(Event.<Title>builder().object(title).type(ADD_ITEM).build());
    }

    @Override
    public void remItem(Item item) {
        title.remItem(item);
        notifyListeners(Event.<Title>builder().object(title).type(REM_ITEM).build());
    }

    @Override
    public int size() {
        return title.getItems().size();
    }

    @Override
    public float getValues(int i) {
        return title.getItems().get(i).getValue();
    }

    @Override
    public double total() {
        return title.getItems().stream().mapToDouble(Item::getValue).sum();
    }

    @Override
    public String getTitle() {
        return title.getName();
    }

    @Override
    public String getTitle(int i) {
        return title.getItems().get(i).getName();
    }

    @Override
    public String getUnit() {
        return title.getUnit();
    }

    @Override
    public String getDescription(int i) {
        return title.getItems().get(i).getDescription();
    }
}

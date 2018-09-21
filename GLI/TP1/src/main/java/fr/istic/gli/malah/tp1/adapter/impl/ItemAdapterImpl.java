package fr.istic.gli.malah.tp1.adapter.impl;

import fr.istic.gli.malah.tp1.adapter.ItemAdapter;
import fr.istic.gli.malah.tp1.model.Item;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ItemAdapterImpl extends ObserverImpl<Item> implements ItemAdapter {

    private Item item;

    @Override
    public String getName() {
        notifyListeners(Event.<Item>builder().object(item).type(GET_NAME).build());
        return item.getName();
    }

    @Override
    public String getDescription() {
        notifyListeners(Event.<Item>builder().object(item).type(GET_DESCRIPTION).build());
        return item.getDescription();
    }

    @Override
    public float getValue() {
        notifyListeners(Event.<Item>builder().object(item).type(GET_VALUE).build());
        return item.getValue();
    }

    @Override
    public void setName(String name) {
        item.setName(name);
        notifyListeners(Event.<Item>builder().object(item).type(SET_NAME).build());
    }

    @Override
    public void setDescription(String description) {
        item.setDescription(description);
        notifyListeners(Event.<Item>builder().object(item).type(SET_DESCRIPTION).build());
    }

    @Override
    public void setValue(float value) {
        item.setValue(value);
        notifyListeners(Event.<Item>builder().object(item).type(SET_VALUE).build());
    }
}

package fr.istic.gli.malah.tp1.adapter;

import fr.istic.gli.malah.tp1.model.Item;

public interface ItemAdapter extends Observer<Item> {

    String GET_NAME = "item-get-name";
    String GET_DESCRIPTION = "item-get-description";
    String GET_VALUE = "item-get-value";
    String SET_NAME = "item-set-name";
    String SET_DESCRIPTION = "item-set-description";
    String SET_VALUE = "item-set-value";

    String getName();

    String getDescription();

    float getValue();

    void setName(String name);

    void setDescription(String description);

    void setValue(float value);
}

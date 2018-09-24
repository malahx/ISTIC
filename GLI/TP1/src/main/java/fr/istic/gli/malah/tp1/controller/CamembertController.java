package fr.istic.gli.malah.tp1.controller;

public interface CamembertController {
    boolean isSelected();
    void setSelected(boolean value);
    int getSelectedPie();
    void setSelectedPie(int value);
    void deSelect();
    void selectPie(int value);
    void nextPie();
    void previousPie();
}

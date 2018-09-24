package fr.istic.gli.malah.tp1.controller.impl;

import fr.istic.gli.malah.tp1.adapter.TitleAdapter;
import fr.istic.gli.malah.tp1.controller.CamembertController;
import fr.istic.gli.malah.tp1.view.CamembertView;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CamembertControllerImpl implements CamembertController {

    private boolean selected;
    private int selectedPie;
    private TitleAdapter title;
    private CamembertView view;

    public CamembertControllerImpl(TitleAdapter title, CamembertView view) {
        view.setController(this);
        this.title = title;
        this.view = view;
        this.selected = false;
        this.selectedPie = -1;
    }

    @Override
    public void deSelect() {
        setSelected(false);
        view.paint(view.getGraphics());
    }

    @Override
    public void selectPie(int value) {
        setSelected(true);
        setSelectedPie(value);
        System.out.println("Selected pie" + view);
        view.paint(view.getGraphics());
    }

    @Override
    public void nextPie() {
        setSelectedPie((selectedPie + 1) % title.size());
        System.out.println("Selected pie" + getSelectedPie());
        view.paint(view.getGraphics());
    }

    @Override
    public void previousPie() {
        setSelectedPie(selectedPie > 0 ? (selectedPie - 1 % title.size()) : title.size() -1);
        System.out.println("Selected pie" + getSelectedPie());
        view.paint(view.getGraphics());
    }
}

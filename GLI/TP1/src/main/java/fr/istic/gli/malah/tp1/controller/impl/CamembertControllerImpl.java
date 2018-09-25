package fr.istic.gli.malah.tp1.controller.impl;

import fr.istic.gli.malah.tp1.adapter.TitleAdapter;
import fr.istic.gli.malah.tp1.controller.CamembertController;
import fr.istic.gli.malah.tp1.event.CustomMouseListener;
import fr.istic.gli.malah.tp1.view.CamembertView;
import lombok.Getter;
import lombok.Setter;

import java.awt.event.MouseEvent;

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
        this.view.addMouseListener((CustomMouseListener) e -> {

        });
        this.selected = false;
        this.selectedPie = -1;
    }

    private void clickOn(MouseEvent e) {
        if (center.contains(e.getX(), e.getY())) {
            controller.deSelect();
        } else {

            for (int i = 0; i < arcs.size(); i++) {
                if (arcs.get(i).contains(e.getX(), e.getY())
                        && !emptyCenter.contains(e.getX(), e.getY())) {
                    selectPie(i);
                }
            }
        }

        if (previous.contains(arg0.getX(), arg0.getY())) {
            nextPie();
        }

        if (next.contains(arg0.getX(), arg0.getY())) {
            previousPie();
        }
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

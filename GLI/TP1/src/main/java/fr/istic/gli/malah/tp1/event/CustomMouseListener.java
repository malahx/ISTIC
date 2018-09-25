package fr.istic.gli.malah.tp1.event;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public interface CustomMouseListener extends MouseListener {

    @Override
    default void mousePressed(MouseEvent e) {

    }

    @Override
    default void mouseReleased(MouseEvent e) {

    }

    @Override
    default void mouseEntered(MouseEvent e) {

    }

    @Override
    default void mouseExited(MouseEvent e) {

    }
}

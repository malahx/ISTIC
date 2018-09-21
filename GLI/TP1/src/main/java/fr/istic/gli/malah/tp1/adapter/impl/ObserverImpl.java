package fr.istic.gli.malah.tp1.adapter.impl;

import fr.istic.gli.malah.tp1.adapter.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class ObserverImpl<T> implements Observer<T> {

    private List<Listener<T>> listeners;

    @Override
    public void addListener(Listener<T> listener) {
        if (listeners == null) {
            listeners = new ArrayList<>();
        }
        listeners.add(listener);
    }

    @Override
    public void remListener(Listener<T> listener) {
        if (listeners == null) {
            listeners = new ArrayList<>();
        }
        listeners.remove(listener);
    }

    @Override
    public void notifyListeners(final Event<T> event) {
        listeners.forEach(l -> l.fire(event));
    }
}

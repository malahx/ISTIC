package fr.istic.gli.malah.tp1.adapter;

import lombok.Builder;
import lombok.Data;

public interface Observer<T> {
    void addListener(Listener<T> listener);

    void remListener(Listener<T> listener);

    void notifyListeners(final Event<T> event);

    interface Listener<T> {
        void fire(Event<T> event);
    }

    @Data
    @Builder
    class Event<T> {
        private T object;
        private String type;
    }
}

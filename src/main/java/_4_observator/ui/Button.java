package _4_observator.ui;

import java.util.ArrayList;
import java.util.List;

/*Observable*/
public class Button implements Observable {

    private List<ObserverOnClick> observers = new ArrayList<>();

    public void click() {
        //vrai traitement
        for (ObserverOnClick observer : observers) {
            observer.onClick();
        }
    }

    public void subscribe(ObserverOnClick observer) {
        observers.add(observer);
    }
}

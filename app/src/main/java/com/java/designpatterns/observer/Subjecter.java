package com.java.designpatterns.observer;

import java.util.ArrayList;

public class Subjecter implements Subject {

    private ArrayList<Observer> observers = new ArrayList<>();
    private String action;

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void disregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void mnotify() {
        for(Observer observer : observers)
        {
            observer.update();
        }
    }

    @Override
    public void setAction(String action) {
        this.action = action;
    }
}

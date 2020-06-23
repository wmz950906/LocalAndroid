package com.java.designpatterns.observer;

public class ObserverOne extends Observer {

    protected ObserverOne(String observerName, Subject subject) {
        super(observerName, subject);
    }

    @Override
    public void update() {
        System.out.println(getClass());
//        throw new UnsupportedOperationException();
    }
}

package com.java.designpatterns.observer;

public abstract class Observer {

    private String observerName;
    private Subject subject;

    public abstract void update();

    protected Observer(String observerName, Subject subject) {
        this.observerName = observerName;
        this.subject = subject;
    }
}

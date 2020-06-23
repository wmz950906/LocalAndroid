package com.java.designpatterns.observer;

public interface Subject {
    void register(Observer observer);

    void disregister(Observer observer);

    void mnotify();

    void setAction(String action);
}

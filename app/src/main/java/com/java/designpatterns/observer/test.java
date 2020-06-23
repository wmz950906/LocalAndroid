package com.java.designpatterns.observer;

public class test {
    public static void main(String[] args) {
        Subjecter subjecter = new Subjecter();
        ObserverOne observerOne = new ObserverOne("observerOne", subjecter);
        ObserverOne observerOneOne = new ObserverOne("observerOneOne", subjecter);
        subjecter.register(observerOne);
        subjecter.register(observerOneOne);
        subjecter.setAction("new action");
        subjecter.mnotify();
    }
}

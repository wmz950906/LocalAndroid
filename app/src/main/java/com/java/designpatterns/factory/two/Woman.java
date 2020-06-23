package com.java.designpatterns.factory.two;

public class Woman implements ManCreator {
    @Override
    public void createMan() {
        System.out.println("woman");
    }
}

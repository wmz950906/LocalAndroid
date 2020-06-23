package com.java.designpatterns.factory.three;

public class Woman implements ManCreator {
    @Override
    public void createMan() {
        System.out.println("woman");
    }

    @Override
    public void createSmallMan() {
        throw new UnsupportedOperationException();
    }
}

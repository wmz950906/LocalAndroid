package com.java.designpatterns.factory.three;

public class SmallMan implements ManCreator {
    @Override
    public void createMan() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void createSmallMan() {
        System.out.println("smallman");
    }
}

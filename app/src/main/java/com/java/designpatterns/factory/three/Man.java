package com.java.designpatterns.factory.three;

public class Man implements ManCreator {
    @Override
    public void createMan() {
        System.out.println("man");
    }

    @Override
    public void createSmallMan() {
        throw new UnsupportedOperationException();
    }
}

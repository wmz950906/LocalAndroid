package com.java.designpatterns.factory.two;

public class Man implements ManCreator {
    @Override
    public void createMan() {
        System.out.println("man");
    }
}

package com.java.designpatterns.factory.two;

public class test {
    public static void main(String[] args) {
        Man man = new Man();
        man.createMan();
        Woman woman = new Woman();
        woman.createMan();
    }
}

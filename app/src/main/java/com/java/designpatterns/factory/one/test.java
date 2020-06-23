package com.java.designpatterns.factory.one;

public class test {
    public static void main(String[] args) {
        PersonFactory personFactory = new PersonFactory();
        personFactory.createPerson("man");
        personFactory.createPerson("woman");
    }
}

package com.java.designpatterns.factory.one;

public class PersonFactory {
    public void createPerson(String type) {
        switch (type) {
            case "man":
                System.out.println("man");
                break;
            case "woman":
                System.out.println("woman");
                break;
        }
    }
}

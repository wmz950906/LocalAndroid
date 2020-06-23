package com.java.designpatterns.factory.three;

public class test {
    public static void main(String[] args) {
        Man man = new Man();
        man.createMan();
        Woman woman = new Woman();
        woman.createMan();
        SmallMan smallMan = new SmallMan();
//        smallMan.createMan();
        smallMan.createSmallMan();
        SmallWoman smallWoman = new SmallWoman();
        smallWoman.createSmallMan();
    }
}

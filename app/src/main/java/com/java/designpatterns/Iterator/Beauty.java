package com.java.designpatterns.Iterator;

import androidx.annotation.NonNull;

public class Beauty {

    private String name;
    private int age;
    private float score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public Beauty(String name, int age, float score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @NonNull
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name:" + getName() + ", ");
        sb.append("Age:" + getAge() + ", ");
        sb.append("score:" + getScore() + " ");
        return sb.toString();
    }
}

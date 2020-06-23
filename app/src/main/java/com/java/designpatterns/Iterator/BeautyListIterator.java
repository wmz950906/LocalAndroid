package com.java.designpatterns.Iterator;

public class BeautyListIterator implements Iterator {

    private BeautyList beautyList;
    private int index;

    public BeautyListIterator(BeautyList beautyList) {
        this.beautyList = beautyList;
        this.index = 0;
    }

    public BeautyListIterator(BeautyList beautyList, int index) {
        this.beautyList = beautyList;
        this.index = index;
    }

    @Override
    public boolean hasNext() {
        if (index < beautyList.getBeautyLenth()) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        Beauty beauty = beautyList.getBeauty(index);
        index++;
        return beauty;
    }
}

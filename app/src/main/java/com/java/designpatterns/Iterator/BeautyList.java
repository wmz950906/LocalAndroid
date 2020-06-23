package com.java.designpatterns.Iterator;

import java.util.ArrayList;

public class BeautyList implements Aggregate {

    private ArrayList<Beauty> beautyArrayList = new ArrayList<>();

    public void add(Beauty beauty)
    {
        beautyArrayList.add(beauty);
    }

    public void remove(Beauty beauty){
        beautyArrayList.remove(beauty);
    }

    public Beauty getBeauty(int index){
        return beautyArrayList.get(index);
    }

    public int getBeautyLenth(){
        return beautyArrayList.size();
    }

    @Override
    public Iterator iterator() {
        return new BeautyListIterator(this);
    }
}

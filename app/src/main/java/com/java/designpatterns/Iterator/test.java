package com.java.designpatterns.Iterator;

public class test {
    public static void main(String[] args) {

        BeautyList beautyList = new BeautyList();

        Beauty xishi = new Beauty("西施", 17, 9);
        Beauty wangzhaojun = new Beauty("王昭君", 18, 9);
        Beauty diaocan = new Beauty("貂蝉", 19, 9);
        Beauty yangyuhuang = new Beauty("杨玉环", 20, 9);

        beautyList.add(xishi);
        beautyList.add(wangzhaojun);
        beautyList.add(diaocan);
        beautyList.add(yangyuhuang);

        Iterator iterator = beautyList.iterator();
        while(iterator.hasNext())
        {
            Beauty beauty = (Beauty) iterator.next();
            System.out.println(beauty.toString());
        }
    }
}

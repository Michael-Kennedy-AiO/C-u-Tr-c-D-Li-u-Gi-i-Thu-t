package com.tiendd2008110316.tuan5;

import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        
        ArrayList list = new ArrayList<>();
        list.add("Tiến");
        list.add (true);
        list.add(1);
        list.add(2.5);
        Integer x = (Integer)list.get(2);
        for(Object object: list)
            System.out.println(list);
        

        ArrayList<String>DSSV = new ArrayList<String>();
        DSSV.add("Tiến");
        DSSV.add("Kha");
        DSSV.add("Bằng");
        DSSV.add("Meow");
        String s = DSSV.get(3);
        System.out.println(s);
    }
}
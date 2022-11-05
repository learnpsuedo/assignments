package com.comany;

import java.util.*;

public class RandomValuesDemo {
    public static void main(String args[]) {
        HashMap<Integer, Double> h = new HashMap<Integer, Double>();
        h.put(1, 1.0);
        h.put(2, 2.0);
        h.put(3, 3.0);

        h.put(4, 4.0);
        Set s = h.entrySet();
        System.out.println(s);


    }
}

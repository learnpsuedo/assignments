package com.company;

import java.lang.String;

class Pair<K,V>
{
    private K key;
    private V value;
    public Pair(K key,V value)
    {
        this.key=key;
        this.value=value;
    }
    public K setKey()
    {
        System.out.println(key);
        return key;
    }
    public V setValue()
    {
        System.out.println(value);
        return value;
    }
}
public class Geniricclass {
    public static void main(String[] args) {
        Pair<String,String> myobj1=new Pair<>("1","Hello");
        myobj1.setKey();
        myobj1.setValue();


        Pair<String,Integer > myobj2=new Pair<String,Integer>("Today is",8);
        myobj2.setKey();
        myobj2.setValue();
    }
}




package com.company;

import java.util.*;

import java.util.stream.Collector;
import java.util.stream.Collectors;



class Fruit {
    String name;

    int price;
    int Calories;
    String color;

    Fruit(String name, int price,  int Calories,String color) {
        this.name = name;
        this.price = price;
        this.Calories= Calories;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return Calories;
    }

    public void setCalories(int Calories) {
        this.Calories = Calories;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor()
    {
        this.color=color;
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +

                ", price=" + price +
                ", calories=" + Calories +
                ", color='" + color + '\'' +
                '}';
    }
}



class SortbyCalories implements Comparator
{
    public int compare(Object i1, Object i2)
    {
        Integer s1=(Integer)i1;
        Integer s2=(Integer)i2;
        return s2.compareTo(s1);
    }
}



public class FruitAssignment {
    public static void main(String[] args) {
        Fruit f1 = new Fruit("Apple", 100, 100, "Red");
        Fruit f2=new Fruit("Banana",120,150,"PaleYellow");
        Fruit f3 = new Fruit("Mango", 80, 50, "Yellow");
        Fruit f4 = new Fruit("Orange", 200, 200, "Orange");
        Fruit f5 = new Fruit("Pomegranate", 60, 300, "Red");
        ArrayList<Fruit> l = new ArrayList<>();
        {
            l.add(f1);
            l.add(f2);
            l.add(f3);
            l.add(f4);
            l.add(f5);

        }

        List<Fruit>  sortedlist1=  l.stream().filter(c->c.getCalories()<100).sorted(Comparator.comparingInt(Fruit::getCalories)).collect(Collectors.toList());
        sortedlist1.forEach(System.out::println);
        List<Fruit>  sortedlist2=  l.stream().sorted(Comparator.comparing(Fruit::getColor)).collect(Collectors.toList());
        sortedlist2.forEach(System.out::println);
        List<Fruit>  sortedlist3=  l.stream().filter(p->p.getColor().equals("red")).sorted(Comparator.comparingInt(Fruit::getCalories)).collect(Collectors.toList());
        sortedlist3.forEach(System.out::println);


    }
}

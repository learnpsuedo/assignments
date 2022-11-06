package com.company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Trader
{
    String name;
    String city;

    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity()
    {

        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trader trader = (Trader) o;
        return city.equals(trader.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city);
    }




    @Override
    public String toString() {
        return "Trader{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

}

public class TraderAssignment {
    public static void main(String[] args) {
        Trader t1 = new Trader("Mounika", "Bhainsa");
        Trader t2 = new Trader("Bhuvana", "Nizamabad");
        Trader t3 = new Trader("Sahithi", "Pune");
        Trader t4 = new Trader("Gayathri", "Maklur");
        Trader t5 = new Trader("Akhila" , "Pune");


        ArrayList<Trader> tr = new ArrayList<>();
        {
            tr.add(t1);
            tr.add(t2);
            tr.add(t3);
            tr.add(t4);
            tr.add(t5);

        }

        tr.stream().distinct().forEach(p -> System.out.println(p.getCity()));
        List<Trader> sortedlist= tr.stream().filter(p -> p.getCity().equals("Pune" )).sorted(Comparator.comparing(Trader::getName)).collect(Collectors.toList());
        sortedlist.forEach(System.out::println);
        List<Trader> sortedlist1 = tr.stream().sorted(Comparator.comparing(Trader::getCity)).collect(Collectors.toList());
        sortedlist1.forEach(System.out::println);
        List<Trader> sortedlist2= tr.stream().filter(p -> p.getCity().equals("Nizamabad")).collect(Collectors.toList());
        System.out.println(sortedlist2);
        tr.stream().sorted(Comparator.comparing(Trader::getName)).forEach(p->System.out.println(p.getName()));

    }
}
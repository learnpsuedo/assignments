package com.company;

public class Main
{
    public static void main(String[] args) {
        Manager m1 = new Manager(n = "monu", sal = "17000", h = 460, t = 1000);
        Labour l1 = new Labour(n = "Sahithi", sal = "20000", h = 657, t = 1675);
        System.out.println("salary of Manager" + m1.name + "=" + m1.getSalary());
        System.out.println("salary of Labour" + l1.name + "=" + l1.getSalary());
    }
}

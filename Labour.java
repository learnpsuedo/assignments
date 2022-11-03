package com.company;

import static jdk.internal.org.jline.utils.Colors.h;

public class Labour extends Employee{
    int hra,ta;
    Labour()
    {
        super();
        hra=ta=0;

    }
    Labour(String n,int sal,int h,int t)\
    {
        super(n,sal);
        hra=h;
        ta=t;

    }
    int getSalary()
    {
        return(super.getSalary()+hra+ta);
    }
}

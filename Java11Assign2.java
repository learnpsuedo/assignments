package com.company;

interface Demo
{
    void demo(int a);
}

public class Java11Assign2
{

    public static void main(String[] args)
    {
        var x=23;
        Demo demo1=(var a)->{
            System.out.println(a);
        };
        demo1.demo(10);
    }
}

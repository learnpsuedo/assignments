package com.company;

public class Arithmetic_operation {
    public static void main(String[] args)
    {
        Arithmetic addition = (int n1,int n2) ->  n1+n2;
        Arithmetic subtraction = (int n1,int n2) ->  n1-n2;
        Arithmetic multiplication  = (int n1,int n2) ->  n1*n2;
        Arithmetic division = (int n1,int n2) ->  n1/n2;

        System.out.println( "addition="+addition.operation(10,5));
        System.out.println( "subtraction="+subtraction.operation(10,5));
        System.out.println( "multiplication="+addition.operation(10,5));
        System.out.println( "division="+addition.operation(10,5));
    }
    

}

@FunctionalInterface

    interface Arithmetic
    {
        int operation(int n1, int n2);
    }

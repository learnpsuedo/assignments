package com.company;

import java.util.Scanner;

import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        try {


            int i, j, k;
            Scanner s = new Scanner(System.in);
            System.out.println("enter a value");
            i = s.nextInt();
            System.out.println("enter another value");
            j = s.nextInt();
            k = i / j;
        } catch (ArithmeticException ex) {
            System.out.println("UnsupportedOperationException");
        }
    }
}
package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.lang.String;
import java.util.Arrays;

    public class Java11Assign3
    {
        public static void main(String[] args)
        {
            String str = new String("A ,quick ,brown, fox, jump, over, the, lazy, dog");
            ArrayList<String> s1 = new ArrayList<>(Arrays.asList(str.split(",")));
            System.out.println(s1);
            System.out.println(s1.get(3));
            System.out.println(s1.get(8));

        }
    }


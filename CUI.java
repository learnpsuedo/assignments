package com.company;

import java.util.Scanner;

public class CUI {

    public static void main(String[] args) {
        if (!validateUser()) {
            System.out.println("Contact admin");
        }

    }
    public static boolean validateUser() {
        boolean result=false;
        String userid,password;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter userid:");
            userid=sc.nextLine();
            System.out.println("Enter password:");
            password=sc.next();
            if(userid.equals("Bhuvana")&&(password.equals("12345")));
               System.out.println("welcome\t"+userid);


                result=true;
                return result;
        }

        return result;




    }


}

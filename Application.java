package com.company;



import java.util.Scanner;

public class Application
{
    public static void main(String args[])
    {
        int count,  flag = 0;
        String username = "Bhuvana";
        String password = "Bhuvana@1123";
        Scanner s = new Scanner(System.in);
        System.out.println("Loginname:");
        String loginname = s.next();
        System.out.println("Enter password");
        String upassword = s.next();

        for (count = 0; count <=3; count++)
        {

            if ((username.equals(loginname)) && (password.equals(upassword)))
            {

                flag = 1;
                break;

            } else
            {
                System.out.println("Loginname:");
                loginname = s.next();
                System.out.println("Enter password");
                upassword = s.next();


            }
            if (count > 3)
            {
                System.out.println("contact admin");
            }

        }
        if (flag == 1)
            {
                System.out.println("Welcome Bhuvaneshwari");
            }


    }
}
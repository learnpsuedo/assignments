package com.company;

interface Order {

    void criteria(int price);

}

public class Lambda2
{
    public static void main(String[] args)
    {
        Order lamdaexpression=(int a) ->{
            if(a>10000)
            {
                System.out.println("Order price is more than 10000");
                System.out.println("Completed");
            }
            else
            {
                System.out.println("not accepted");

            }
        };
        lamdaexpression.criteria(15000);
    }
}
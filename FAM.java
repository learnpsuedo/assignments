package com.company;

public class FAM {
    public static void main(String[] args)
    {

        int num1,num2,num3,result,temp;
        for(int number = 100; number <= 999; number++)
        {
            temp = number;
            num3=temp%10;
            temp=temp/10;

            num2=temp%10;
            temp=temp/10;

            num1=temp%10;
            result=(num1 * num1 * num1)+( num2 * num2 * num2)+(num3 * num3 * num3);

            if(number==result){
                System.out.println(number + " is armstrong Number");
            }
        }
    }

}


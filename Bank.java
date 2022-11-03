package com.company;

class account
{
    int  balance=10000;
    public int balance()
    {
        return balance;

    }

    public int withdraw(int amount)
    {
        if (amount > balance)
        {
            throw new NotSufficientFundException(String.format("current balance is %d less than %d required" +balance +amount));
        }
        balance = balance - amount;
        return balance;
    }

    public void deposit(int amount)
    {
        if (amount <= 0)
        {
            throw new IllegalArgumentException(String.format("invalid deposit amount %d", amount));

        }
    }
    class NotSufficientFundException extends RuntimeException
    {
        String message;
        public NotSufficientFundException(String message)
        {
            this.message=message;
        }

        public String getMessage()
        {
            return message;
        }
    }

}
public class Bank {
    public static void main(String[] args)
    {

        account a=new account();
        System.out.println("current balance: "+a.balance());
        System.out.println("withdrawing ");
        a.withdraw(20000);
        System.out.println("current balance is"+a.balance());
        a.withdraw(20000);
        a.deposit(-20000);


    }

}

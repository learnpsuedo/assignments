package com.company;

 abstract class Cocept {
    abstract void main();

}
class Reading extends Cocept{
    void main()
    {
        System.out.println("Reading");
    }
}
abstract class write extends Cocept
{
    abstract void main();

}
abstract class Detail
{
    private int age;

}

public class CoceptAbstraction {

    public static void main(String[] args)
    {
        Reading r=new Reading();
        r.main();
    }
}

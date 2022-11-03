package com.company;
class Manager extends Employee {
    int hra,ta;
    Manager()
    {
        super=0;
        hra=ta=0;
    }
    Manager(String n,int sal,int h,int t )
    {
        super(n,sal);
        hra=h;
        ta=t;
    }
    int getSalary()
    {
        return(super,getSalary()+hra+ta);

    }

}

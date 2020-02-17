package com.epam.task4.epamtask;

import java.util.*;
import java.io.*;
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("--SIMPLE INTEREST--");
        System.out.println("Enter principle amount : ");
        int p=sc.nextInt();
        System.out.println("Enter rate of interest : ");
        int r=sc.nextInt();
        System.out.println("Enter time duration : ");
        int t=sc.nextInt();
        Simple obj1 = new Simple(p,t,r);
        Compound obj2 = new Compound(p,t,r);
        double amountS=obj1.simpleInt();
        System.out.println("Amount is : "+amountS);
        double amountC=obj2.compoundInt();
        System.out.println("--COMPOUND INTEREST--");
        System.out.println("Amount is : "+amountC);
        System.out.println("---CONSTRUCTION COST---");
        System.out.println("Enter material standard option..");
        System.out.print("Construction cost per sq.feet is\n1.1200INR for standard material\n2.1500INR for above standard material.\n3.1800INR for high standard material\n4.2500INR for high standard material and fully automated home.");
        int op=sc.nextInt();
        int cost = 0;
        if(op==1)
        	cost=1200;
        else if(op==2)
        	cost=1500;
        else if(op==3)
        	cost=1800;
        else if(op==4)
        	cost=2500;
        else
        	System.out.println("enter valid option");
        
        System.out.println("Enter total area of house : ");
        int area=sc.nextInt();
        Construction obj3 = new Construction(cost,area);
        int total=obj3.totalAmount();
        System.out.println("Total cost for construction of house is : "+total);
        
        
    }
}

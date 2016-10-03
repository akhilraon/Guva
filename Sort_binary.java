package com.example.akhil.myapplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by akhil on 3/10/16.
 */
public class Sort_binary {

    public static void main(String[] args)
    {

        Number temp=new Number();
      Number[] num=new Number[10];
        int n;

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
try
{
System.out.println("Enter the number of elements");
    n=Integer.parseInt(br.readLine());
    System.out.println("Enter the array");
    for(int i=0;i<n;i++)
    {
        num[i].setDecimal(Integer.parseInt(br.readLine()));

    }
    Number z=new Number();
    for(int i=0;i<n-1;i++)
    {
        num[i].setBinary(Integer.bitCount(num[i].getDecimal()));
        for(int j=i+1;j<n;j++)
        {
            if(num[i].getBinary()<num[j].getBinary())
            {
temp=num[i];
                num[i]=num[j];
                num[j]=temp;
            }
            else if(num[i].getBinary()==num[j].getBinary())
            {
                if(num[i].getDecimal()<num[j].getDecimal())
                {
z=num[i];
                    num[i]=num[j];
                    num[j]=z;
                }
            }
        }
    }
    System.out.println("The Number after sorting based on binary is");
    for(int i=0;i<n;i++)
    {
        System.out.println(String.valueOf(num[i].getDecimal())+"=>"+String.valueOf(num[i].getBinary()));
    }
}
catch(Exception e)
{

}
    }
   static class Number
    {
        public Number() { }
        public int decimal;
        public int binary;
        public void setDecimal(int decimal)
        {
            this.decimal=decimal;

        }
        public int getDecimal()
        {
            return this.decimal;
        }
        public void setBinary(int binary)
        {
            this.binary=binary;
        }
        public int getBinary()
        {
            return this.binary;
        }
    }

}

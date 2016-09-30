package com.example.akhil.myapplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by akhil on 30/9/16.
 */
public class Array_list {


    public static void main(String[] args)
    {

      int[] a=new int[10];
        int n,sum=0;
     BufferedReader br;
        br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter N");
        try
        {
            n=Integer.parseInt(br.readLine());
            System.out.println("Enter "+String.valueOf(n)+" Numbers");
            for(int i=0;i<n;i++)
            {

                a[i]=Integer.parseInt(br.readLine());
            }
outer: for(int i=0;i<n-1;i++)
{
    for(int j=i+1;j<n;j++)
    {
        if(a[i]==a[j])
        {
            sum=a[i];
            break outer;
        }
    }

}
            if(sum==0)
            {
                System.out.println("The Number Is Not Repeated");

            }
            else
            {
                System.out.println("The Number " +String.valueOf(sum)+" Repeated First Time");
            }
        }
        catch(IOException e)
         {


         }


    }
}

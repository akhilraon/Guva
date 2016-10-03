package com.example.akhil.myapplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by akhil on 3/10/16.
 */
public class Duplicate {
    public static void main(String[] args)
    {
        int[] number=new int[15];
        int n,t;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try
        {
            System.out.println("Enter the number of element");
            n=Integer.parseInt(br.readLine());
            System.out.println("Enter the Student Roll Number in Digits");
            for(int i=0;i<n;i++)
            {
                number[i]=Integer.parseInt(br.readLine());
            }
System.out.println("Duplicate Roll Numbers are");
            for(int i=0;i<n-1;i++)
            {
                for(int j=i+1;j<n;j++)
                {
                    if(number[i]==number[j])
                    {
                      System.out.println(String.valueOf(number[i]));
                    }
                }
            }

        }
        catch(Exception e)
        {

        }
    }



}

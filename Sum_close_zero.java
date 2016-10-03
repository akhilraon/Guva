package com.example.akhil.myapplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by akhil on 3/10/16.
 */
public class Sum_close_zero {
    public static void main(String[] args)
    {
        int[] number=new int[15];
        int n,t;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try
        {
System.out.println("Enter the number of element");
            n=Integer.parseInt(br.readLine());
            System.out.println("Enter the element(+ve and -ve)");
            for(int i=0;i<n;i++)
            {
number[i]=Integer.parseInt(br.readLine());
            }

            for(int i=0;i<n-1;i++)
            {
                for(int j=i+1;j<n;j++)
                {
                    if(number[i]>number[j])
                    {
                        t=number[i];
                        number[i]=number[j];
                        number[j]=t;
                    }
                }
            }
            for(int i=0;i<n;i++)
            {

                if(number[i+1]>0)
                {
                   System.out.println(String.valueOf(number[i])+" "+String.valueOf(number[i+1]));
                    break;

                }


            }
        }
        catch(Exception e)
        {

        }
    }
}

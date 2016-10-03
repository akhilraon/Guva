package com.example.akhil.myapplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by akhil on 3/10/16.
 */
public class Tallest {

    public static void main(String[] args)
    {
        int[] number=new int[15];
        int n,target;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try
        {
            System.out.println("Enter the height of a members");
            n=Integer.parseInt(br.readLine());

            for(int i=0;i<n;i++)
            {
                number[i]=Integer.parseInt(br.readLine());
            }
Arrays.sort(number);
System.out.println("Height of 4th tallest is"+String.valueOf(number[n-1-4]));

        }
        catch(Exception e)
        {

        }
    }
}

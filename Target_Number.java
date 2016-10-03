package com.example.akhil.myapplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by akhil on 3/10/16.
 */
public class Target_Number {
    public static void main(String[] args)
    {
        int[] number=new int[15];
        int n,target;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try
        {
            System.out.println("Enter the number of element in the array");
            n=Integer.parseInt(br.readLine());
            System.out.println("Enter the target element");
            target=Integer.parseInt(br.readLine());
            for(int i=0;i<n;i++)
            {
                number[i]=Integer.parseInt(br.readLine());
            }

            for(int i=0;i<n-1;i++)
            {
                for(int j=i+1;j<n;j++)
                {
                    if(target==number[i]+number[j])
                    {
                    System.out.println("Numbers after adding that match target are"+String.valueOf(number[i])+" "+String.valueOf(number[j]));
                    }
                }
            }

        }
        catch(Exception e)
        {

        }
    }

}

package com.example.akhil.myapplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by akhil on 3/10/16.
 */
public class Subset {
    public static void main(String[] args) {
        int[] number = new int[15];
        int[] number2 = new int[15];
        int n, t,m;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter the number of element");
            m = Integer.parseInt(br.readLine());
            System.out.println("Enter the First Array Elements");
            for (int i = 0; i < m; i++) {
                number[i] = Integer.parseInt(br.readLine());
            }
            System.out.println("Enter the number of element");
            n = Integer.parseInt(br.readLine());
            System.out.println("Enter the second Array Elements");
            for (int i = 0; i < n; i++) {
                number2[i] = Integer.parseInt(br.readLine());
            }
boolean flag=false;
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
if(number[i]==number2[j])
{
    flag=true;
}
                    else{
    flag=false;
                    }
                }
                if(!flag)
                {
                    System.out.println("A is not subset of B");
                    break;
                }

            }

if(flag)
{
    System.out.println("A is subset of B");
}

        } catch (Exception e) {

        }
    }
}

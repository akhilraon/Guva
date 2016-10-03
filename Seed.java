package com.example.akhil.myapplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by akhil on 3/10/16.
 */
public class Seed {
    public static void main(String[] args) {


        int n;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter the number");
            n = Integer.parseInt(br.readLine());
            int cal=n,d,mul=1;
            while(cal!=0)
            {
             d=cal%10;
             mul=mul*d;
             cal=cal/10;

            }
            System.out.println("The Seed of a number is "+String.valueOf(n*mul));
        } catch (Exception e) {

        }
    }
}

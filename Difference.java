package com.example.akhil.myapplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by akhil on 30/9/16.
 */
public class Difference {

    public static void main(String[] args) {

        int[] a = new int[10];
        int n, sum = 0, m;
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter N");

        try {
            m = Integer.parseInt(br.readLine());
            System.out.println("Enter the Number to find difference");
            n = Integer.parseInt(br.readLine());
            System.out.println("Enter " + String.valueOf(m) + " Numbers");

            for (int i = 0; i < m; i++) {
                a[i] = Integer.parseInt(br.readLine());
            }

            for (int i = 0; i < m - 1; i++) {
                for (int j = i + 1; j < m; j++) {
                    if (a[i] - a[j] == n || a[j]-a[i]==n) {
System.out.print(String.valueOf(a[i]+" "+String.valueOf(a[j]))+" ");
                    }
                }
            }


        } catch (Exception e) {

        }

    }
}

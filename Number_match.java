package com.example.akhil.myapplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by akhil on 3/10/16.
 */
public class Number_match {
    public static void main(String[] args) {
        int[] number = new int[15];
        int n, t;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Enter the number of element");
            n = Integer.parseInt(br.readLine());
            System.out.println("Enter the Student Roll Number in Digits");
            for (int i = 0; i < n; i++) {
                number[i] = Integer.parseInt(br.readLine());
            }
            System.out.println("Index Numbers are");
            for (int i = 0; i < n; i++) {

                if (number[i] == i) {
                    System.out.println("The matched index is" + String.valueOf(i));
                }

            }

        } catch (Exception e) {

        }


    }
}

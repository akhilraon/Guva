package com.example.akhil.myapplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by akhil on 30/9/16.
 */
public class Division {

    public static void main(String[] args) {

        int[] a = new int[10];
        int n, sum = 0,m;
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter The 2 Numbers");

        try {
            m = Integer.parseInt(br.readLine());
            n=Integer.parseInt(br.readLine());
            System.out.println("Result After Division is" + String.valueOf(divide(m, n)));

        } catch (Exception e) {

        }


    }
    static int  divide(int nu, int de) {

        int temp = 1;
        int quotient = 0;

        while (de <= nu) {
            de <<= 1;
            temp <<= 1;
        }

        //printf("%d %d\n",de,temp,nu);
        while (temp > 1) {
            de >>= 1;
            temp >>= 1;

            if (nu >= de) {
                nu -= de;
                //printf("%d %d\n",quotient,temp);
                quotient += temp;
            }
        }

        return quotient;
    }
}

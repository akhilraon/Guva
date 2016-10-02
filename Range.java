package com.example.akhil.myapplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by akhil on 2/10/16.
 */
public class Range {
    public static void main(String[] args)
    {

        int m,n,num,binary_count,prime_count=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Range");
        try
        {
            m=Integer.parseInt(br.readLine());
            n=Integer.parseInt(br.readLine());

            for(int i=m;i<=n;i++)
            {
binary_count=Integer.bitCount(i);
                prime_count=0;
                for(int j=1;j<=binary_count;j++)
                {
                    if((binary_count%j)==0)
                    {
                        prime_count+=1;
                    }
                    if(prime_count==2)
                    {
                        System.out.print(String.valueOf(i)+" "+"=> "+String.valueOf(binary_count)+" Prime Bits \n");
                        prime_count=0;
                        break;
                    }
                }


            }

        }
        catch(Exception e)
        {

        }


    }

}

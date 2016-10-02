package com.example.akhil.myapplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by akhil on 2/10/16.
 */
public class Palindrome {
    public static void main(String[] args)
    {
        int n;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        List<String> list=new LinkedList<String>();
        System.out.println("Enter the number of character");
        try {
            n=Integer.parseInt(br.readLine());
            System.out.println("Enter the Character");
            for(int i=0;i<n;i++)
            {

                list.add(br.readLine());
            }
boolean palindrome=false;
for(int j=list.size()-1,i=0;i<list.size()&&j>=0&&i!=j;i++,j--)
{
if(list.get(i).equals(list.get(j)))
{
palindrome=true;

}
    else
{
    palindrome=false;
    break;
}
}
            System.out.println(palindrome==true?"List is palindrome":"List is not palindrome");





        }
        catch(Exception e)
        {
e.printStackTrace();
        }

    }
    class Node
    {
        public String character;

    }

}

package com.example.akhil.myapplication;

import android.app.Fragment;
import android.app.FragmentManager;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by akhil on 2/10/16.
 */
public class String_class {
    public static void main(String[] args)
    {
        String full_sentence;
        String[] words=new String[20];
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        try
        {
      System.out.println("Enter the sentence(set of words)");
            full_sentence=String.valueOf(br.readLine());

            words=full_sentence.split(" ");
            for(int i=0;i<words.length;i++)
            {
StringBuffer word_reverse=new StringBuffer(words[i]);


                System.out.print(word_reverse.reverse()+ " ");

            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}

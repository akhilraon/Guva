package com.akgil;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0,sum=0;
		
		
		int[][] a={{1,0,1,1,1},
				  {1,0,0,1,1},
				  {2,2,1,1,1},
				  {0,2,0,0,0},
				  {2,2,2,0,0}};
		

for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++)
	{
		//System.out.println(a[i+1][j]);
		if(a[i][j]>0 && a[i][j+1]>0 && a[i][j+2]>0 && a[i+1][j+1]>0 && a[i+2][j]>0 && a[i+2][j+1]>0 && a[i+2][j+2]>0)
		{
			count=a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
		   if(sum<count)
		   {
			   sum=count;
		   }
		}
				
	}
}
System.out.println("Largest Sum="+sum);

	}

}

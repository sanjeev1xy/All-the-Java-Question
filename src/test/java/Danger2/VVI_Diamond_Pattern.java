
    //*
   //***
  //*****
 //*******
//*********
 //*******
  //*****
   //***
   // *

package Danger2;

public class VVI_Diamond_Pattern 
{
	public static void main(String[] args) 
	{
		int n = 5;

		// upper
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<2*n;j++)
		    {
		        if(j>=n-i && j<=n+i)
		            System.out.print("*");
		        else
		            System.out.print(" ");
		    }
		    System.out.println();
		}

		// lower (FIXED)
		for(int i=n-2;i>=0;i--)   // 🔴 change loop
		{
		    for(int j=0;j<2*n;j++)
		    {
		        if(j>=n-i && j<=n+i)   // 🔴 same condition as upper
		            System.out.print("*");
		        else
		            System.out.print(" ");
		    }
		    System.out.println();
		}
	}
}
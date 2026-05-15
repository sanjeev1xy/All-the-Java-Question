package Danger1;

import java.util.Scanner;

public class String_Assign_1
{
//I/P=My name is Sanjeev
//O/P=Sanjeev is name My
	
//I/P=123 456
//O/P=456 123 	
	
	public static void main(String[] args) 
	{
		System.out.println("Plz Enter the String");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String []s1=s.split(" ");
		String rev="";
		for(int i=s1.length-1;i>=0;i--)
		{
			rev=rev+s1[i]+" ";
		}
		System.out.println(rev);
	}
}

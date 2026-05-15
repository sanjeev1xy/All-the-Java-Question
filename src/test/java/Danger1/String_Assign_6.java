package Danger1;

import java.util.Scanner;

public class String_Assign_6 
{
//I/P=My name is Sanjeev
//O/P=veejnaS si eman yM
	
	public static void main(String[] args) 
	{
		System.out.println("Plz Enter a String");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String revstr="";
		for(int i=s.length()-1;i>=0;i--)
		{
			revstr=revstr+s.charAt(i);
		}
		System.out.println(revstr);
	}
}

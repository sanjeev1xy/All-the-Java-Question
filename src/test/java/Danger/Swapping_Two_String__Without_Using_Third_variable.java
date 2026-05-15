package Danger;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Swapping_Two_String__Without_Using_Third_variable 
{
	public static void main(String[] args) 
	{
//I/P:Before Swapping value is My name is Sanjeev,Kumar Thakur
//O/P:After swapping value is Kumar Thakur,My name is Sanjeev
		
		System.out.println("PLz Enter the String a and b");
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		System.out.println("Values before swapping"+a+","+b);
		a = a + b;        // concatenate
		b = a.substring(0, a.length() - b.length()); // extract original a
		a = a.substring(b.length());                 // extract original b
		System.out.println("Value after swapping "+a+","+b);
	}
}

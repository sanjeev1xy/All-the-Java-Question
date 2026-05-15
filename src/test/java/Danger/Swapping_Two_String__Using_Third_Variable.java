package Danger;

import java.util.Scanner;

public class Swapping_Two_String__Using_Third_Variable 
{
	public static void main(String[] args) 
	{
//I/P=Before Swapping Value is My Name is Sanjeev,I am From Bihar
//O/P=After Swapping Value is I am From Bihar,My Name is Sanjeev
		
		System.out.println("Please.Enter the Value");
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		String c;
		System.out.println("Before Swapping Value is "+a+","+b);
		c=b;
		b=a;
		a=c;
		System.out.println("After Swapping Value is "+a+","+b);
	}

}

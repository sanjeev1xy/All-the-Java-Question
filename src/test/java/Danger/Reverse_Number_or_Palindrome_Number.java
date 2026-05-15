package Danger;

import java.util.Scanner;

public class Reverse_Number_or_Palindrome_Number 
{
public static void main(String[] args) 
{
	
	//A number that remains the same when reversed.
		//121 → Reverse = 121 ✔ Palindrome  
		//1221 → Reverse = 1221 ✔ Palindrome  
		//123 → Reverse = 321 ❌ Not Palindrome  
		//454 → Reverse = 454 ✔ Palindrome  
	
System.out.println("Plz Enter a number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int temp=n;
int rem, rev=0;
while(temp!=0)
{
	rem=temp%10;
	rev=rev*10+rem;
	temp=temp/10;
}

if(n==rev)
{
	System.out.println("Number is reverse  "+n);
}
else
{
	System.out.println("Number is not reverse "+n);
}
}
}

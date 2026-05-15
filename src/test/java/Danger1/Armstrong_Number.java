package Danger1;

import java.util.Scanner;

public class Armstrong_Number 
{
public static void main(String[] args) 
{
	//A number whose sum of cubes of 
	//digits is equal to the number itself  
	//153,370,371,407
	
System.out.println("Plz enter the number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int temp=n;
int rem, rev=0;
while(n>0)
{
	rem=n%10;
	rev=(rem*rem*rem)+rev;
	n=n/10;
}
if(rev==temp)
{
	System.out.println("Armstrong Number");
}
else
{
	System.out.println("Not a Armstrong Number");
}
}
}


package A_Java;

import java.util.Scanner;

public class Fibonacci_Series
{
public static void main(String[] args) 
{
	/*
	 I/P:4
	 O/P:Fibonacci numbers are : 
		0 1
		 1
		 2
		 3
		 5
*/
System.out.println("Plz Enter the number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a=0,b=1,c;
System.out.println("Fibonacci numbers are : ");
System.out.println(a+" "+b);
for(int i=1;i<=n;i++)
{
	c=a+b;
	System.out.println(" "+c);
	a=b;
	b=c;
}
}
}

package A_Java;

import java.util.Scanner;

public class Factorial_Number 
{
public static void main(String[] args) 
{
	//I/P:5
	//O/P:120
	
System.out.println("Plz Enter the number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int fact=1;
for(int i=1;i<=n;i++)
{
	fact=fact*i;
}
System.out.println("factorial of number  "+fact);
}
}

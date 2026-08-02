package A_Java;

import java.util.Scanner;

public class Sum_Of_Digits_Of_A_Number 
{
public static void main(String[] args) 
{
	//I/P=1234
	//O/P=10
	
	//I/P=12345-1-3
	//O/P=11
	
System.out.println("Plz Enter a number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0;
while(n>0)
{
	sum=sum+n%10;
	n=n/10;
}
System.out.println(sum);
}
}

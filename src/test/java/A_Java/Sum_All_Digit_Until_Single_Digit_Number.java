package A_Java;

import java.util.Scanner;

public class Sum_All_Digit_Until_Single_Digit_Number 
{
public static void main(String[] args) 
{
	//I/P=1234
	//O/P=10
	
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

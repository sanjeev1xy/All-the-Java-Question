package A_Java;

import java.util.Scanner;

public class Swapping_Two_Numbers__Without_Using_Third_variable 
{
public static void main(String[] args) 
{
	System.out.println("Plz Enter the Value a & b");
	Scanner sc=new Scanner(System.in); 
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("Before Swapping Number is "+a+","+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After Swapping numbers is "+a+","+b);	
}
}

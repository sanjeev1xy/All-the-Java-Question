package Danger;

import java.util.Scanner;

public class Reverse_Number 
{
public static void main(String[] args) 
{
	//I/P:6754
	//O/P:Original number: 6754
	//O/P:Reversed number: 4576
	
	Scanner sc=new Scanner(System.in);
	 System.out.println("Plz.Enter a value ");
	 int n=sc.nextInt();   
	 int temp = n;
    int rev = 0, rem;

    while (temp != 0) 
    {
        rem = temp % 10;       // extract last digit
        rev = rev * 10 + rem;  // append digit
        temp = temp / 10;      // remove last digit
    }

    System.out.println("Original number: " + n);
    System.out.println("Reversed number: " + rev);	
}
}

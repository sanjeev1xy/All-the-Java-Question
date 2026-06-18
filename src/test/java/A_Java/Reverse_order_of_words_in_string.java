package A_Java;

import java.util.Scanner;

public class Reverse_order_of_words_in_string
{
//I/P=My name is Sanjeev
//O/P=Sanjeev is name My
	
//I/P=123 456
//O/P=456 123 	
	
//I/P=My Roll Number is 1388
//O/P=1388 is Number Roll My
	
	public static void main(String[] args) 
	{
		System.out.println("Plz Enter the String");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String []s1=s.split(" ");
		String revstr="";
		for(int i=s1.length-1;i>=0;i--)
		{
			revstr=revstr+s1[i]+" ";
		}
		System.out.println(revstr);
	}
}

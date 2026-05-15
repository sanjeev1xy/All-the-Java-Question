package Danger;

import java.util.Scanner;

public class Reverse_Each_Word_in_a_Sentence 
{
public static void main(String[] args) 
{
	//I/P:My name is Sanjeev
	//O/P:yM eman si veejnaS
	
	//I/P:1234
	//O/P:4321

	//I/P:Ab 25 234
	//O/P:bA 52 432
	
Scanner sc=new Scanner(System.in);
System.out.println("Plz Enter the String");
String s=sc.nextLine();
	
//String s="Software Testing";
	
String [] s1=s.split(" ");
String revstr="";
for(String w:s1)
{
	String revword="";
	for(int i=w.length()-1;i>=0;i--)
	{
		revword=revword+w.charAt(i);
	}
	revstr=revstr+revword+" ";
}
System.out.println(revstr);
}
}

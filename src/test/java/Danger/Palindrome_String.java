package Danger;

import java.util.Scanner;

public class Palindrome_String 
{
public static void main(String[] args) 
{
	
	//A string that reads the same forward and backward.

	//madam  → madam ✔ Palindrome  
	//level  → level ✔ Palindrome  
	//radar  → radar ✔ Palindrome  
	//noon   → noon  ✔ Palindrome  
	//hello  → olleh ❌ Not Palindrome  
	//racecar → racecar ✔ Palindrome
	
	
System.out.println("Plz Enter a String");
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String orgstr=s;
String revstr="";

for(int i=s.length()-1;i>=0;i--)
{
	revstr=revstr+s.charAt(i);
}
if(orgstr.equals(revstr))
{
	System.out.println("this is a palondrome String ");
}
else
{
	System.out.println("this is not a palindrome String");
}
}
}

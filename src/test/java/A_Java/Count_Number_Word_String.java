package A_Java;

import java.util.Scanner;

public class Count_Number_Word_String 
{
public static void main(String[] args) 
{
	//I/P:My name is Sanjeev
	//O/P:4
	
	//I/P:a
	//O/P:1
	
	//I/P:123 12345
	//O/P:2

	//I/P:23
	//O/P:1
	
System.out.println("Plz Enter the String");
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int count=1;
for(int i=0;i<s.length()-1;i++)
{
	if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' '))
	count++;
}
System.out.println("Number of word in the string "+count);
}
}
 
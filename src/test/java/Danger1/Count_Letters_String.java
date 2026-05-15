package Danger1;

import java.util.Scanner;

public class Count_Letters_String 
{
public static void main(String[] args) 
{
	//I/P:abcdefgj
	//O/P:8

	//I/P:abdc cd
	//O/P:6

System.out.println("Plz.Enter a value ");
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int count=0;
for(int i=0;i<s.length();i++)
{
	if(Character.isLetter(s.charAt(i)))
	{
		count++;
	}
}
System.out.println("letters in the string are "+count);
}
}

package Danger1;

import java.util.ArrayList;
import java.util.Scanner;

public class Longest_Common_Substring 
{
public static void main(String[] args) 
{
	
	//Please Enter the first String 
	//I/P:My name is Sanjeev
	//Please Enter the Second String
	//I/P:kumar Thakur My
	//O/P:longest common substring My
	
Scanner sc=new Scanner(System.in);
System.out.println("Plz Enter the first string");
String s1=sc.nextLine();
System.out.println("Plz enter the secons string");
String s2=sc.nextLine();
ArrayList<String>commonSubStrings=new ArrayList<String>();
String longestSubString="";
for(int i=0;i<s1.length();i++)
{ 
	for(int j=i+1;j<s1.length();j++)
	{
		String substr=s1.substring(i,j);
		if(s2.contains(substr))
		{
			commonSubStrings.add(substr);
			if(substr.length()>longestSubString.length())
			{
				longestSubString=substr;
			}
		}
	}
}
System.out.println("longest common substring: "+longestSubString);
sc.close();
}
}

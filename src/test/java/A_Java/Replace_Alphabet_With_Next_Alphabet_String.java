package A_Java;

import java.util.Scanner;

public class Replace_Alphabet_With_Next_Alphabet_String 
{
public static void main(String[] args) 
{
	//I/P:Ab bc EF
	//O/P:Bc cd FG
	
System.out.println("Plz Enter the String");
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String result="";

for(char ch:s.toCharArray())
{
	//if it's a lowercase letter
	if(ch>='a' && ch<='z')
	{
		result+=(ch=='z')?'a':(char)(ch+1);
	}
	//if it's an uppercase letter
	else if(ch>='A' && ch<='Z')
	{
		result+=(ch=='Z')?'A':(char)(ch+1);
	}
	//if it's not a letter , keep it changed
	else
	{
		result+=ch;
	}
}
//print the result
System.out.println("result : "+result);
sc.close();
}
}

package A_Java;

import java.util.Scanner;

public class Count_Capitalized_String
{
public static void main(String[] args) 
{
//I/P:Count Capitalized Words In String $$
//O/P:Count of upper case letter   5
//O/P:count of lower case letter    24
	
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string:");
String s = sc.nextLine();

int countLowerCase=0;
int countUpperCase=0;
char[] ch=s.toCharArray();
for(char ch1:ch)
{
	if(Character.isUpperCase(ch1))
	{
		countUpperCase++;
	}
	else if(Character.isLowerCase(ch1))
	{
		countLowerCase++;
	}
	else
	{
		continue;
	}
}
System.out.println("Count of upper case letter   "+countUpperCase);
System.out.println("count of lower case letter    "+countLowerCase);
}
}

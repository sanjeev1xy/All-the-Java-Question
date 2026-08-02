package A_Java;

import java.util.Scanner;

public class String_input_a2b3c1d3_output_aabbbcddd 
{
public static void main(String[] args) 
{
	//I/P=a2b3c1d3
	//O/P=aabbbcddd
	
	//I/P=a2 b3 c2d4
	//O/P=aabbbccdddd
	
System.out.println("Plz.Enter a value ");
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();

for(int i=0; i<s.length();i++)
{
	if(Character.isAlphabetic(s.charAt(i)))
	{
		System.out.print(s.charAt(i));
	}
	else
	{
		int y=Character.getNumericValue(s.charAt(i));
		for(int j=1;j<y;j++)
		{
			System.out.print(s.charAt(i-1)); //i-1 basically iterate the loop i.e a2 2-1 b3 3-2 like that 
		}
	}
}
}
}

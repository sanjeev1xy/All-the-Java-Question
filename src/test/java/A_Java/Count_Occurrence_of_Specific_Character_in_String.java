package A_Java;

import java.util.Scanner;

public class Count_Occurrence_of_Specific_Character_in_String 
{
//I/P=My name is Sanjeev
//O/P=Occurrence of 'e' = 3
	
	public static void main(String[] args) 
	{
		System.out.println("Plz Enter the String ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char c = 'e';
		int count = 0;
		for (int i = 0; i < s.length(); i++) 
		{
		    if (s.charAt(i) == c)   // compare each character
		    {
		        count++;
		    }
		}
		System.out.println("Occurrence of 'e' = " + count);
	}
}

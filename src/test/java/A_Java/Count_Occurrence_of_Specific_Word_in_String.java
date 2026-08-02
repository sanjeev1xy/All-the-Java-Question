package A_Java;

import java.util.Scanner;

public class Count_Occurrence_of_Specific_Word_in_String
{
//I/P=My name is Sanjeev My
//O/P=occurence of word of My : 2
	
	public static void main(String[] args) 
	{
		System.out.println("Plz Enter the String");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String []s1=s.split(" ");
		String word="My";
		int count=0;
		for(int i=0;i<s1.length;i++)
		{
			if(word.equals(s1[i]))
			{
				count++;
			}
		}
		System.out.println("occurence of word of My : "+count);
	}
}

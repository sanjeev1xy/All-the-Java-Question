package Danger;

import java.util.Scanner;

public class Reverse_a_String_Sentence 
{
	public static void main(String[] args) 
	{
		//I/P:My Name is Sanjeev
		//O/P:veejnaS si emaN yM
		
		//I/P:MynameisSanjeev
		//O/P:veejnaSsiemanyM
		
		//I/P:123456
		//O/P:654321
		
		//I/P:123 456
		//O/P:654 321
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        String revstr = "";
        for (int i = s.length() - 1; i >= 0; i--) 
        {
            revstr=revstr+s.charAt(i);
        }
        System.out.println("Reversed string: " + revstr);
	}
}

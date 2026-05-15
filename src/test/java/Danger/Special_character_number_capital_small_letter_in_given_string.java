package Danger;

import java.util.Scanner;

public class Special_character_number_capital_small_letter_in_given_string 
{
	public static void main(String[] args) 
	{
		    Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a string:");
	        String s = sc.nextLine();
	        int uppercase = 0;
	        int lowercase = 0;
	        int numbers = 0;
	        int specialChars = 0;
	        char [] ch = s.toCharArray();
	        for(char ch1:ch)
	        {
	            if (Character.isUpperCase(ch1))
	            {
	                uppercase++;
	            } 
	            else if (Character.isLowerCase(ch1)) 
	            {
	                lowercase++;
	            } 
	            else if (Character.isDigit(ch1))
	            {
	                numbers++;
	            } 
	            else 
	            {
	                specialChars++;
	            }
	        }
	        System.out.println("Uppercase letters: " + uppercase);
	        System.out.println("Lowercase letters: " + lowercase);
	        System.out.println("Numbers: " + numbers);
	        System.out.println("Special characters: " + specialChars);
	}
}

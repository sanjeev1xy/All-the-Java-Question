package Danger;

import java.util.Scanner;

public class Reverse_only_letters_keep_symbols_same_place 
{
public static void main(String[] args) 
{ 
	//I/P String s=abc#d@ef&gh
	//O/P String s=hgf#e@dc&ba
	
	//I/P:abcd &*&  fgf
	//O/P:fgfd &*&  cba
	
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Plz.Enter a value ");
	      String s=sc.nextLine();

	        // Step 1: Take only letters
	        String letters = "";
	        for(int i = 0; i < s.length(); i++)
	        {
	            if(Character.isLetter(s.charAt(i)))
	            {
	            	letters = s.charAt(i) + letters;  // reverse letters
	            }
	        }

	        // Step 2: Put reversed letters back, leave symbols same
	        int index = 0;
	        String revstr = "";
	      
	        for(int i = 0; i < s.length(); i++)
	        {
	            if(Character.isLetter(s.charAt(i)))
	            {
	            	 revstr= revstr+letters.charAt(index++);
	            }
	            else
	            {
	            	 revstr= revstr+s.charAt(i); // symbol stays same place
	            }
	        }

	        System.out.println( revstr);  // hgf#e@dc&ba
	    }
	}




package Danger_B;

import java.util.Arrays;

public class E_Sort_characters_of_string_in_ascending_ 
{
	 public static void main(String[] args) 
	 {
	        String s = "I love my job";
	        s = s.replace(" ", ""); // remove spaces
	        char[] ch = s.toCharArray(); // convert to char array
	        Arrays.sort(ch); // sort characters
	        for(char c : ch) 
	        {
	            System.out.print(c + " ");
	        }
	    }

}

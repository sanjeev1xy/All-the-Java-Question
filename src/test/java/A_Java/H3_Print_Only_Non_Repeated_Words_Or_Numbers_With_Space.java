package A_Java;

import java.util.HashMap;
import java.util.Scanner;

public class H3_Print_Only_Non_Repeated_Words_Or_Numbers_With_Space 
{
public static void main(String[] args) 
{
		//I/P:-My name is Sanjeev My name is Sanjeev Kumar Thakur
		//O/P:-Kumar Thakur  
	
		//I/P:-1 2 3 4 5 6 7 8 9 1 2 3 4
		//O/P:-5 6 7 8 9 
	
	System.out.println("Plz Enter Numbers (with space):");
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine(); 
	String[] s1 = s.split("\\s+"); //Split the sentence into words using space as separator
	HashMap<String, Integer> mp = new HashMap<String, Integer>();
	for(String word:s1)
	{
	    if (mp.containsKey(word))
	    {
	        mp.put(word, mp.get(word) + 1);
	    }
	    else
	    {
	        mp.put(word, 1);
	    }
	}
	for (String word : mp.keySet())
	{
	    if (mp.get(word) == 1)   // print only unique numbers
	    {
	        System.out.print(word + " ");
	    }
	}
	sc.close();	
}
}

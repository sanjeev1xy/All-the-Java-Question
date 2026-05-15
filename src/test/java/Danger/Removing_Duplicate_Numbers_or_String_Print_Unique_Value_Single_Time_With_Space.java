package Danger;

import java.util.HashMap;
import java.util.Scanner;

public class Removing_Duplicate_Numbers_or_String_Print_Unique_Value_Single_Time_With_Space
{
public static void main(String[] args) 
{
		//I/P:-My name is Sanjeev My name is Sanjeev Kumar Thakur
		//O/P:-Kumar Thakur Sanjeev name is My
	
		//I/P:-1 2 3 4 5 6 7 8 9 1 2 3 4
		//O/P:-1 2 3 4 5 6 7 8 9 
		
	System.out.println("Plz Enter Numbers (with space):");
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine(); 
    String[] s1 = s.split("\\s+");
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
    for (String word : mp.keySet())   // print each number only once
    {
        System.out.print(word + " ");
    }

    sc.close();
}
}


package Danger;

import java.util.HashMap;
import java.util.Scanner;

public class Removing_Duplicates_Number_or_Character_Without_Space 
{
public static void main(String[] args) 
{
		//I/P:123456789123
		//O/P:123456789
	
		//I/P:SanjeevSanjeevkumar
		//O/P:Sanjevkumr
	
	System.out.println("Plz Enter Numbers:");
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine(); 
    HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
    for(char ch:s.toCharArray())
    {
        if (mp.containsKey(ch))
        {
            mp.put(ch, mp.get(ch) + 1);
        }
        else
        {
            mp.put(ch, 1);
        }
    }
    for(char ch:s.toCharArray())
    {
        if (mp.containsKey(ch))
        {
            System.out.print(ch);
            mp.remove(ch); // remove so it prints only once
        }
    }
    sc.close();	
}
}

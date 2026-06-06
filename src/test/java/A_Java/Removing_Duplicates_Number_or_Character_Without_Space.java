package A_Java;

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
    for(char c:s.toCharArray())
    {
        if (mp.containsKey(c))
        {
            mp.put(c, mp.get(c) + 1);
        }
        else
        {
            mp.put(c, 1);
        }
    }
    for(char c:s.toCharArray())
    {
        if (mp.containsKey(c))
        {
            System.out.print(c);
            mp.remove(c); // remove so it prints only once
        }
    }
    sc.close();	
}
}

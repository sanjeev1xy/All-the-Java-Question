package A_Java;

import java.util.HashMap;
import java.util.Scanner;

public class H6_Count_Only_Duplicate_Characters_Or_Numbers_With_Or_Without_Space 
{
    public static void main(String[] args) 
    {
    	//My name is Sanjeev Kumar 
    	//  → 4
    	//a → 3
    	//e → 3
    	//m → 2
    	//n → 2
    	
    	//MynameisSanjeev
    	//a → 2
    	//e → 3
    	//n → 2
    	
    	//1 2 3 4 5 6 1 2 3 4
        //  → 9
        //1 → 2
        //2 → 2
        //3 → 2
        //4 → 2
    	
    	//1234561234
    	//1 → 2
    	//2 → 2
    	//3 → 2
    	//4 → 2
    	
        System.out.println("Plz Enter the String ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        HashMap<Character, Integer> mp = new HashMap<>();
        for (char ch : s.toCharArray())
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
        for (char ch : mp.keySet())
        {
            if (mp.get(ch) > 1)
            {
                System.out.println(ch + " → " + mp.get(ch));
            }
        }
    }
}

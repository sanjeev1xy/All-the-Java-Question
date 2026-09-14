package A_Java;

import java.util.HashMap;
import java.util.Scanner;

public class H6_Count_Only_Duplicate_Characters_Or_Numbers_With_Or_Without_Space 
{
    public static void main(String[] args) 
    {
//My name is Sanjeev Kumar //MynameisSanjeevKumar
//  → 4                          
//a → 3                    a → 3
//e → 3                    e → 3
//m → 2                    m → 2
//n → 2                    n → 2
        
//1 2 3 4 5 6 1 2 3 4      //1234561234
//  → 9
//1 → 2                    //1 → 2
//2 → 2                    //2 → 2
//3 → 2                    //3 → 2
//4 → 2                    //4 → 2
        	
//a b 1 2 3 a 2 b 3        ab123a2b3
//a → 2                    a → 2 
//  → 8                    b → 2 
//b → 2                    2 → 2 
//2 → 2                    3 → 2 
    	
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

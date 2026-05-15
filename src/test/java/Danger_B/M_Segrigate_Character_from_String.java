package Danger_B;

import java.util.HashMap;

public class M_Segrigate_Character_from_String 
{

    public static void main(String[] args)
    {
    	//I/P: RAINBOW_12345_30.04.2026
    	//O/P: RAINBOW
    	
        String abc = "RAINBOW_12345_30.04.2026";
        String[] s = abc.split("_");   // correct split
        HashMap<String, Integer> mp = new HashMap<String, Integer>();
        for(String w : s)
        {
            if(mp.containsKey(w))
            {
                mp.put(w, mp.get(w) + 1);
            }
            else
            {
                mp.put(w, 1);
            }
        }

        for(String w : mp.keySet())
        {
            // check only alphabets
            if(w.matches("[A-Za-z]+"))
            {
                System.out.println(w);
            }
        }
    }
}

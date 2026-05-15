package Danger_B;

import java.util.HashMap;

public class N_Segrigate_Date_from_String 
{
	public static void main(String[] args)
    {
		//I/P: RAINBOW_12345_30.04.2026
		//O/P: 30.04.2026
		
        String abc = "RAINBOW_12345_30.04.2026";
        String[] s = abc.split("_");   // split by underscore
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
            // check only date format (dd.mm.yyyy)
            if(w.matches("\\d{2}\\.\\d{2}\\.\\d{4}"))
            {
                System.out.println(w);
            }
        }
    }
}

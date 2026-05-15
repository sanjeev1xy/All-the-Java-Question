package Danger_B;

import java.util.HashMap;

public class O_Segrigate_Number_from_String 
{
	 public static void main(String[] args)
	    {
		 //I/P: RAINBOW_12345_30.04.2026
		 //O/P: 12345
		 
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
	            // check only number (digits)
	            if(w.matches("\\d+"))
	            {
	                System.out.println(w);
	            }
	        }
	    }
}

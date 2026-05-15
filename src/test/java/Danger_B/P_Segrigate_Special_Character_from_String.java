package Danger_B;

import java.util.HashMap;

public class P_Segrigate_Special_Character_from_String 
{
	 public static void main(String[] args)
	    {
		 //I/P: RAINB@OW_123@#45_30.04%%.2026
		 //O/P: %%@#@
		 
	        String abc = "RAINB@OW_123@#45_30.04%%.2026";
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
	            // extract and print only special characters
	            String special = w.replaceAll("[A-Za-z0-9.]", "");

	            if(!special.isEmpty())
	            {
	                System.out.print(special);
	            }
	        }
	    }
}

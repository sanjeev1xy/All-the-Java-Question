package A_Java;

public class String_Array_Column_Wise 
{       
	public static void main(String[] args) 
	{
	    String[] s = {"abc", "def", "ghi"};      // Input: 3 strings
	    String result = "";                      // Store final answer

	    for (int i = 0; i < s[0].length(); i++)  // Loop through columns
	    {  
	    for (int j = 0; j < s.length; j++)       // Loop through strings
	    {
	    	result = result + s[j].charAt(i);    // Get character and add to result
	    }
	    }
	        System.out.println(result);          // Print: adgbehcfi
	}
} 

/*	How the loops work
    ------------------
	i = 0 → a + d + g = adg
	i = 1 → b + e + h = beh
	i = 2 → c + f + i = cfi

	Final = adg + beh + cfi
	      = adgbehcfi

	Easy formula to remember:
    -------------------------
	s[j].charAt(i)
	  ↑         ↑
	 row      column
	*/



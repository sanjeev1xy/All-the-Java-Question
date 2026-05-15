package Danger_B;

public class B_Count_the_number_of_pairs_of_parentheses 
{
	  public static void main(String[] args) 
	    {
	        String str = "()(())((((";

	        int open = 0;
	        int pairCount = 0;

	        for (int i = 0; i < str.length(); i++) 
	        {
	            char ch = str.charAt(i);

	            if (ch == '(') 
	            {
	                open++;   // count opening
	            } 
	            else if (ch == ')') 
	            {
	                if (open > 0) 
	                {
	                    pairCount++; // one pair formed
	                    open--;      // match used
	                }
	            }
	        }

	        System.out.println("Total Pairs: " + pairCount);
	        System.out.println("Total Brackets Used: " + (pairCount * 2));
	    }

}

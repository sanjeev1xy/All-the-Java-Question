package Danger_B;

public class L_Count_the_number_of_closed_parentheses_pairs 
{ 
	//O/P: Total pairs: 3
	
	 public static void main(String[] args) 
	    {
	        String s = "()(())((((";
	        int open = 0;
	        int count = 0;
	        for(int i = 0; i < s.length(); i++)
	        {
	            if(s.charAt(i) == '(')
	            {
	                open++;
	            }
	            else if(s.charAt(i) == ')')
	            {
	                if(open > 0)
	                {
	                    count++;   // one pair found
	                    open--;
	                }
	            }
	        }
	        System.out.println("Total pairs: " + count);
	    }
}

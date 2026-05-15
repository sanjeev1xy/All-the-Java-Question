package Danger_B;

public class F_Split_string_into_words
{
	//O/P:- Welcome
          //to
	      //coforge
	
	 public static void main(String[] args)
	    {
	        String str = "Welcome to coforge";

	        String[] splt = str.split(" ");

	        for(int i = 0; i < splt.length; i++)
	        {
	            System.out.println(splt[i]);
	        }
	    }
}

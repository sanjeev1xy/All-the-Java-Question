package Danger;

import java.util.ArrayList;

public class String_Convert_into_3_Word
{
	public static void main(String[] args) 
	{
		//input-s="hello"
		//input-n=3
		//Output=[hel, ell, llo]
		
		String s= "hello";
		int n=3 ;
		 ArrayList<String> list = new ArrayList<>();
	        for (int i = 0; i <= s.length() - n; i++) 
	        {
	            list.add(s.substring(i, i + n));
	        }
	        System.out.println(list); 
}
}

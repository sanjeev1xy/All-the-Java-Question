package Danger0;

public class Extract_Only_UpperCase_From_String 
{
	public static void main(String[] args) 
	{
//I/P: abcdef@#$12345abcjhSDR0123456321ASDFGHJDFGH#$%^&*
//O/P: SDRAFGHJ
		
		String s = "abcdef@#$12345abcjhSDR0123456321ASDFGHJDFGH#$%^&*";
		String result = "";

		for(char ch : s.toCharArray())
		{                             
			if(Character.isUpperCase(ch)) // Check UpperCase character
			{
				if(result.indexOf(ch) == -1) // Check duplicate character
				{
					result = result + ch;
				}
			}
		}
		System.out.println(result);	
	}
}

package Danger0;

public class Extract_Only_LowerCase_from_String 
{
	public static void main(String[] args) 
	{
		//I/P: abcdef@#$12345abcjhSDR0123
		//O/P: abcdefjh    
		
		String s = "abcdef@#$12345abcjhSDR0123456321ASDFGHJDFGH#$%^&*";
		String result = "";

		for(char ch : s.toCharArray())
		{                             
			if(Character.isLowerCase(ch)) // Check lowercase character
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
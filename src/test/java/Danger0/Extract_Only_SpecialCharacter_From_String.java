package Danger0;

public class Extract_Only_SpecialCharacter_From_String  
{
	public static void main(String[] args) 
	{
		//I/P: abcdef@#$12345abcjhSDR0123456321ASDFGHJDFGH#$%^&*
		//O/P: @#$%^&*

		String s = "abcdef@#$12345abcjhSDR0123456321ASDFGHJDFGH#$%^&*";
		String result = "";

		for(char ch : s.toCharArray())
		{
			// Check special character
			if(!Character.isLetterOrDigit(ch))
			{
				// Check duplicate character
				if(result.indexOf(ch) == -1)
				{
					result = result + ch;
				}
			}
		}

		System.out.println(result);	
	}
}
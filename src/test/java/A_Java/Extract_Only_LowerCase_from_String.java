package A_Java;

public class Extract_Only_LowerCase_from_String 
{
	public static void main(String[] args) 
	{
		//Space or without space both are same answer.
		//I/P: abcdef@#$12345abcjhSDR0123456321ASDFGHJDFGH#$%^&*
		//I/P: ab cd ef  @#$1234  5ab  cj    hSDR0123456321ASD     FGHJDFGH#$%^&*
		//O/P: abcdefjh    
		
		//String s = "abcdef@#$12345abcjhSDR0123456321ASDFGHJDFGH#$%^&*";
		String s = "ab cd ef  @#$1234  5ab  cj    hSDR0123456321ASD     FGHJDFGH#$%^&*";
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
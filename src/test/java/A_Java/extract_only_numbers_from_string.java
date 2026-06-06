package A_Java;

public class extract_only_numbers_from_string 
{
	public static void main(String[] args) 
    {
		//Space or without space both are same answer.
		//I/P: abcdef@#$12345abcjhSDR0123456321ASDFGHJDFGH#$%^&*
		//I/P: ab cd ef  @#$1234  5ab  cj    hSDR0123456321ASD     FGHJDFGH#$%^&*
		// O/P: 1234506
		
	  //String s = "abcdef@#$12345abcjhSDR0123456321ASDFGHJDFGH#$%^&*";
		String s = "ab cd ef  @#$1234  5ab  cj    hSDR0123456321ASD     FGHJDFGH#$%^&*";
		String result = "";

		for(char ch : s.toCharArray())
		{                             
			if(Character.isDigit(ch)) // Check number character
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

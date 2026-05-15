package Danger0;

public class extract_only_numbers_from_string 
{
	public static void main(String[] args) 
    {
		// I/P: abcdef@#$12345abcjhSDR0123
		// O/P: 1234506
		
		String s = "abcdef@#$12345abcjhSDR0123456321ASDFGHJDFGH#$%^&*";
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

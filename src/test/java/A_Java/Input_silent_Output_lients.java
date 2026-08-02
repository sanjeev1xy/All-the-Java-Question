package A_Java;

import java.util.HashMap;
import java.util.Map;

public class Input_silent_Output_lients 
{
public static void main(String[] args) 
{
String input="silent";
String output=transformString(input);
System.out.println("Output: "+output);
}
public static String transformString(String s)
{
	HashMap<Character,Character>mp=new HashMap<>();
	
	//Define the transformation rules
	mp.put('s', 'l');
	mp.put('i', 'i');
	mp.put('l', 'e');
	mp.put('e', 'n');
	mp.put('n', 't');
	mp.put('t', 's');
	
	//Build the transformed String
	StringBuilder transformed=new StringBuilder();
	for(char c:s.toCharArray())
	{
		transformed.append(mp.getOrDefault(c, c));
	}
	return transformed.toString();
}
}

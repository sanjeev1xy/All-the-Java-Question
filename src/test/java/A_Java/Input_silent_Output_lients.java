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
	Map<Character,Character>charMap=new HashMap<>();
	
	//Define the transformation rules
	charMap.put('s', 'l');
	charMap.put('i', 'i');
	charMap.put('l', 'e');
	charMap.put('e', 'n');
	charMap.put('n', 't');
	charMap.put('t', 's');
	
	//Build the transformed String
	StringBuilder transformed=new StringBuilder();
	for(char c:s.toCharArray())
	{
		transformed.append(charMap.getOrDefault(c, c));
	}
	return transformed.toString();
}
}

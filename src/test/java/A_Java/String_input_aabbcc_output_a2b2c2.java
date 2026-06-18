package A_Java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class String_input_aabbcc_output_a2b2c2
{
public static void main(String[] args) 
{
	//I/P=aabbcc
	//O/P=a2b2c2
	
System.out.println("Plz.Enter a value ");
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
HashMap<Character,Integer>mp=new HashMap<Character,Integer>();
for(char c:s.toCharArray())
{
	if(mp.containsKey(c))
	{
		mp.put(c, mp.get(c)+1);
	}
	else
	{
		mp.put(c, 1);
	}
}
	// Print result in order
    for (char c : mp.keySet()) 
    {
        System.out.print(c + "" + mp.get(c));
    }
}
}

package A_Java;

import java.util.HashMap;
import java.util.Scanner;

public class H1_Count_Only_Duplicate_Words_Or_Numbers_With_Space 
{
public static void main(String[] args) 
{
//I/P:-	My name is Sanjeev My name is Sanjeev kumar Thakur
	//O/P:-Sanjeev → 2
	//O/P:-name → 2
	//O/P:-is → 2
	//O/P:-My → 2
	
	//I/P:1 1 2 2 3 3 4 5 6
	//O/P:1 → 2
	//O/P:2 → 2
	//O/P:3 → 2

	System.out.println("Plz Enter a Sentence");
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	String[]s1=s.split("\\s+"); //Split the sentence into words using space as separator
	
	HashMap<String, Integer>mp=new HashMap<String, Integer>();
	for (String word:s1)
	{
		if(mp.containsKey(word))
		{
			mp.put(word, mp.get(word)+1);
		}
		else
		{
			mp.put(word, 1);
		}
	}
	for(String word:mp.keySet())
	{
		if(mp.get(word)>1)
		{
			System.out.println(word + " → " + mp.get(word));
		}
	}
	sc.close();
}
}

package A_Java;

import java.util.HashMap;

public class Word_Count_Two_Sentences_With_HashMap 
{
public static void main(String[] args) 
{
	//I/P: String s1 = "this apple is sweet";
	//I/P: String s2 = "this apple is sour";
	
	//O/P:apple -> 2
	//O/P:this -> 2
	//O/P:is -> 2
	//O/P:sweet -> 1
	//O/P:sour -> 1
	
	 String s1 = "this apple is sweet";
     String s2 = "this apple is sour";
     String[] a = s1.split(" ");
     String[] b = s2.split(" ");
     HashMap<String, Integer> map = new HashMap<>();
     for (String w : a) 
     {
         map.put(w, map.getOrDefault(w, 0) + 1);
     }
     for (String w : b)
     {
         map.put(w, map.getOrDefault(w, 0) + 1);
     }
     for (String key : map.keySet()) 
     {
         System.out.println(key + " -> " + map.get(key));
     }	
}
}

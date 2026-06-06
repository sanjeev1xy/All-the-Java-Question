package A_Java;

import java.util.HashMap;

public class Uncommon_Word_Sentence 
{
	//Input=String s1 = "this apple is sweet";
    //String s2 = "this apple is sour";
	
	//output="sweet","sour"
	
public static void main(String[] args) 
{
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
     boolean first = true;
     for (String key : map.keySet()) 
     {
         if (map.get(key) == 1) 
         {
             if (!first) System.out.print(",");
             System.out.print("\"" + key + "\"");
             first = false;
         }
     }
}
}

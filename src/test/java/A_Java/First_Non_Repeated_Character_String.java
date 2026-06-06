package A_Java;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class First_Non_Repeated_Character_String 
{
    public static void main(String[] args) 
    {
    	//I/P: selenium testing
    	//O/P: First non repeated character: l
    	
    	//System.out.println("Plz.Enter the value");
    	//Scanner sc=new Scanner(System.in);
    	//String s1=sc.nextLine();
    	
    	String s = "Selenium Testing";
        String s1 = s.toLowerCase(); // Convert string to lowercase

         HashMap<Character, Integer> mp = new HashMap<>();
         for (char c : s1.toCharArray())
         {
             mp.put(c, mp.getOrDefault(c, 0) + 1);
         }

         // Find first non-repeating character
         for (char c : s1.toCharArray())
         {
             if (mp.get(c) == 1) 
             {
                 System.out.println("First non repeated character: " + c);
                 break;
             }
         }
    }
}

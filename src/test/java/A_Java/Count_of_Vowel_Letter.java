package A_Java;

import java.util.HashMap;
import java.util.Scanner;

public class Count_of_Vowel_Letter 
{
    public static void main(String[] args) 
    {
    	//Scanner Class or user input
    	/*System.out.println("Plz.Enter the Value");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String []s1=s.split(" ");*/
        
    	//UpperCase
    	//I/P:Selenium Java Appium
    	//O/P:Vowel Count: {A=3, E=2, U=2, I=2}
    	
    	//lowercase
    	//I/P:Selenium Java Appium
    	//O/P:Vowel Count: {a=3, e=2, u=2, i=2}

   
        String[] s = {"selenium", "java", "Appium"};
        HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
        for (String word : s) 
        {
            word = word.toLowerCase(); // handle upper case letters
         // word = word.toUpperCase(); // Handle lower case letters
            for (char ch : word.toCharArray()) 
            {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
             // if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')  // for Upper Case
                {
                    mp.put(ch, mp.getOrDefault(ch, 0) + 1);
                }
            }
        }
        System.out.println("Vowel Count: " + mp);
    }
}

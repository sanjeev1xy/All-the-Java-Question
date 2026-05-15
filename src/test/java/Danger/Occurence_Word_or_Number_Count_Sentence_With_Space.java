package Danger;

import java.util.HashMap;
import java.util.Scanner;

public class Occurence_Word_or_Number_Count_Sentence_With_Space 
{
public static void main(String[] args) 
{
	//I/P:-java testing program and java is powerfull languages
	//O/P:-{java=2, languages=1, and=1, testing=1, is=1, program=1, powerfull=1}

	//I/P:1 2 3 4 5 1 2 3 4
	//O/P:{1=2, 2=2, 3=2, 4=2, 5=1}
	
	//I/P:123445123
	//O/P:{123445123=1}

	System.out.println("Plz Enter a Sentence");
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
    String[] s1 = s.split(" ");
    HashMap<String, Integer> countMap = new HashMap<>(); 
    for (String word:s1)
    {
        if (countMap.containsKey(word)) 
        {
            countMap.put(word, countMap.get(word)+1);
        } 
        else 
        {
            countMap.put(word, 1);
        }
    }

    System.out.println(countMap);
}	
}


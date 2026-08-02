package A_Java;

import java.util.HashMap;
import java.util.Scanner;

public class H7_Count_Occurence_Of_All_Characters_Or_Numbers_With_Or_Without_Space 
{
public static void main(String[] args) 
{
//I/P:My name is Sanjeev
//O/P:{ =3, a=2, s=1, S=1, e=3, v=1, y=1, i=1, j=1, M=1, m=1, n=2}
	
//I/P:MynameisSanjeev
//O/P:{a=2, s=1, S=1, e=3, v=1, y=1, i=1, j=1, M=1, m=1, n=2}
	
//I/P:123412345
//O/P:{1=2, 2=2, 3=2, 4=2, 5=1}
		
//1 2 3 4 5 6 7 8  9 8 7 6 5 4 3
//{ =15, 1=1, 2=1, 3=2, 4=2, 5=2, 6=2, 7=2, 8=2, 9=1}
	                  
	System.out.println("Plz Enter a Sentence");
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	
	HashMap<Character,Integer>countmap=new HashMap<Character,Integer>();
	for(char c:s.toCharArray())
	{
		if(countmap.containsKey(c))
		{
			countmap.put(c, countmap.get(c)+1);
		}
		else
		{
			countmap.put(c, 1);
		}
	}
	System.out.println(countmap);
}
}

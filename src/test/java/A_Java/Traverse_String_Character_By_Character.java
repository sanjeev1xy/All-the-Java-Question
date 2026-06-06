package A_Java;

import java.util.Scanner;

public class Traverse_String_Character_By_Character 
{
public static void main(String[] args) 
{
	System.out.println("Plz Enter the Number");
	Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    for(int i=0;i<s.length();i++)
    {
    	System.out.print(s.charAt(i));
    }
}
}

package A_Java;

import java.util.Scanner;

public class Traverse_String_Word_By_Word 
{
public static void main(String[] args) 
{
	System.out.println("Plz Enter the Number");
	Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String [] s1=s.split(" ");
    for(int i=0;i<s1.length;i++)
    {
    	System.out.print(s1[i]);
    }
}
}

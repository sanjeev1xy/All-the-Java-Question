package A_Java;

import java.util.Scanner;

public class Length_of_String_Without_Using_Length 
{
   public static void main(String[] args) 
   {
	   //I/P:My name is Sanjeev
	   //O/P:Length of the string is: 18
	   
	   Scanner sc = new Scanner(System.in);
       System.out.println("Enter a string:");
       String str = sc.nextLine();
       int count = 0;
       for (int i=0;i<str.length();i++)
       {
           count++;
       }
       System.out.println("Length of the string is: " + count);
       sc.close();
   }
}

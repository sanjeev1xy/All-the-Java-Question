package A_Java;

import java.util.Scanner;

public class Reverse_Alternate_Words 
{
	public static void main(String[] args) 
	{
		//I/P=My name is Sanjeev Kumar Thakur
		//O/P=My eman is veejnaS Kumar rukahT
		
		System.out.println("Plz Enter the String");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split(" ");
        String revstr = "";
        for (int i = 0; i < s1.length; i++)
        {
            String revword = s1[i];
            // Reverse only alternate words (i = 1, 3, 5...)
            if (i % 2 == 1) 
            {
                String revstr1 = "";
                for (int j = revword.length() - 1; j >= 0; j--) 
                {
                    revstr1=revstr1+revword.charAt(j);
                }
                revstr=revstr+revstr1 + " ";
            } 
            else 
            {
                revstr=revstr+revword + " ";
            }
        }
        System.out.println(revstr);
	}

}

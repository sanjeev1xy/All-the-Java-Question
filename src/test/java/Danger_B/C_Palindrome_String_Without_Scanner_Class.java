package Danger_B;

public class C_Palindrome_String_Without_Scanner_Class 
{
	public static void main(String[] args) 
	{
	   String [] s = {"Rohan", "Nitin", "Mohit", "Naman", "Kapil"};
		        
		for(int i = 0; i < s.length; i++)
		{
		 String s1 = s[i].toLowerCase();
		 String orgstr = s1;
		 String revstr = "";

		 for(int j = s1.length()-1; j >= 0; j--)
		 {
		 revstr = revstr + s1.charAt(j);
		 }

		 if(revstr.equals(orgstr))
		 {
		  System.out.println(s[i]+" Palindrome String");
		  }
		  else
		  {
		   System.out.println("Not a palindrome String");
		   }
		 }
	}
}

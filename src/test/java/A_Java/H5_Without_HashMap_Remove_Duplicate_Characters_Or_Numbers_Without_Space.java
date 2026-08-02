package A_Java;

import java.util.Scanner;

public class H5_Without_HashMap_Remove_Duplicate_Characters_Or_Numbers_Without_Space
{
    public static void main(String[] args)
    {
    	//I/P:123456789123
    	//O/P:123456789
    		
    	//I/P:SanjeevSanjeevkumar
    	//O/P:Sanjevkumr
    		
    	
    	 System.out.println("Please ENter the Value");
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         
         for(int i=0;i<s.length();i++)
         {
             int count=1;
             boolean visited =false;
             
             for(int k=0;k<i;k++)
             {
                 if(s.charAt(i)==s.charAt(k))
                 {
                     visited=true;
                     break;
                 }
             }
             if(visited)
             continue;
             for(int j=i+1;j<s.length();j++)
             {
                 if(s.charAt(i)==s.charAt(j))
                 {
                     count++;
                 }
             }
             if(!visited)
             {
                 System.out.print(s.charAt(i));
             }
         }
    }
}

package A_Java;

import java.util.Scanner;

public class H3_Without_HashMap_Print_Only_Non_Repeated_Words_Or_Numbers_With_Space
{
    public static void main(String[] args)
    {
    	//I/P:-My name is Sanjeev My name is Sanjeev Kumar Thakur
    	//O/P:-Kumar Thakur  
    		
    	//I/P:-1 2 3 4 5 6 7 8 9 1 2 3 4
    	//O/P:-5 6 7 8 9 
    	
    	System.out.println("Please Enter the value ");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[]word=s.split("\\s+");      //Split the sentence into words using space as separator
        
        for(int i=0;i<word.length;i++)
        {
            int count=1;
            boolean visited=false;
            
            for(int k=0;k<i;k++)
            {
                if(word[i].equals(word[k]))
                {
                    visited=true;
                    break;
                }
            }
            
            if(visited)
            continue;
            
            for(int j=i+1;j<word.length;j++)
            {
                if(word[i].equals(word[j]))
                {
                    count++;
                }
            }
        
        if(count==1)
        {
            System.out.print(word[i]+" ");
        }
    }
    }
}
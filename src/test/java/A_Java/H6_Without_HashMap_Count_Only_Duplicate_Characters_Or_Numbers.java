package A_Java;

import java.util.Scanner;

public class H6_Without_HashMap_Count_Only_Duplicate_Characters_Or_Numbers
{
    public static void main(String[] args)
    {
    	//My name is Sanjeev Kumar 
    	//  → 4
    	//a → 3
    	//e → 3
    	//m → 2
    	//n → 2
    	
    	//MynameisSanjeev
    	//a → 2
    	//e → 3
    	//n → 2
    	
    	//1 2 3 4 5 6 1 2 3 4
        //  → 9
        //1 → 2
        //2 → 2
        //3 → 2
        //4 → 2
    	
    	//1234561234
    	//1 → 2
    	//2 → 2
    	//3 → 2
    	//4 → 2
    	
        System.out.println("Plz Enter:");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        for(int i=0;i<s.length();i++)
        {
            int count=1;
            boolean visited=false;

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

            if(count>1)
            {
                System.out.println(s.charAt(i)+" → "+count);
            }
        }
        sc.close();
    }
}
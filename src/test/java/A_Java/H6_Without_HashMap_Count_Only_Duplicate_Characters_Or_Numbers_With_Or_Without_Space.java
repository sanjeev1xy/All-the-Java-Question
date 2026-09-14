package A_Java;

import java.util.Scanner;

public class H6_Without_HashMap_Count_Only_Duplicate_Characters_Or_Numbers_With_Or_Without_Space
{
    public static void main(String[] args)
    {
//My name is Sanjeev Kumar //MynameisSanjeevKumar
//  → 4                          
//a → 3                    a → 3
//e → 3                    e → 3
//m → 2                    m → 2
//n → 2                    n → 2
    
//1 2 3 4 5 6 1 2 3 4      //1234561234
//  → 9
//1 → 2                    //1 → 2
//2 → 2                    //2 → 2
//3 → 2                    //3 → 2
//4 → 2                    //4 → 2
    	
//a b 1 2 3 a 2 b 3        ab123a2b3
//a → 2                    a → 2 
//  → 8                    b → 2 
//b → 2                    2 → 2 
//2 → 2                    3 → 2 
//3 → 2
    	
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
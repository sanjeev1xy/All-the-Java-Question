package A_Java;

import java.util.Scanner;

public class H7_Without_HashMap_Count_Occurrence_Of_All_Characters_Or_Numbers
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

            System.out.println(s.charAt(i)+" = "+count);
        }
        sc.close();
    }
}
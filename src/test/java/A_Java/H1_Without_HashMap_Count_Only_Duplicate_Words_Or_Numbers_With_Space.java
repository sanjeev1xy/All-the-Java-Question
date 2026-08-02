package A_Java;

import java.util.Scanner;

public class H1_Without_HashMap_Count_Only_Duplicate_Words_Or_Numbers_With_Space
{
    public static void main(String[] args)
    {
        // I/P: My name is Sanjeev My name is Sanjeev Kumar Thakur
        // O/P:
        // My → 2
        // name → 2
        // is → 2
        // Sanjeev → 2
    	
    	//I/P:1 1 2 2 3 3 4 5 6
    	//O/P:1 → 2
    	//O/P:2 → 2
    	//O/P:3 → 2

        System.out.println("Plz Enter a Sentence");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split("\\s+");    //Split the sentence into words using space as separator

        for(int i=0;i<words.length;i++)
        {
            int count=1;
            boolean visited=false;

            for(int k=0;k<i;k++)
            {
                if(words[i].equals(words[k]))
                {
                    visited=true;
                    break;
                }
            }
            
            if(visited)
                continue;

            for(int j=i+1;j<words.length;j++)
            {
                if(words[i].equals(words[j]))
                {
                    count++;
                }
            }
            if(count>1)
            {
                System.out.println(words[i]+" → "+count);
            }
        }
        sc.close();
    }
}
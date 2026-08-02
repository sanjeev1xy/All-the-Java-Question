package A_Java;

import java.util.Scanner;

public class H2_Without_HashMap_Count_Occurrence_Of_All_Words_Or_Numbers_With_Space
{
    public static void main(String[] args)
    {
    	//I/P:-java testing program and java is powerfull languages
    	//O/P:-{java=2, languages=1, and=1, testing=1, is=1, program=1, powerfull=1}

    	//I/P:1 2 3 4 5 1 2 3 4
    	//O/P:{1=2, 2=2, 3=2, 4=2, 5=1}
    	
    	//I/P:123445123
    	//O/P:{123445123=1}
    	
        System.out.println("Plz Enter a Sentence");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] words=s.split("\\s+"); //Split the sentence into words using space as separator

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

            System.out.println(words[i]+" = "+count);
        }

        sc.close();
    }
}
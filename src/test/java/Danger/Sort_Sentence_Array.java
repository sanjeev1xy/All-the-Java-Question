package Danger;

import java.util.Arrays;

public class Sort_Sentence_Array 
{
    public static void main(String[] args)
    {
        String[] s = {"apple", " ", "kiwi", "orange", "banana", "fig"};
        Arrays.sort(s);
        
        for (String sa : s)
        {
        	System.out.print(sa+",");
        }
    }
}


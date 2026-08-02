package A_Java;

import java.util.Arrays;

public class Sort_Sentence_Array
{
    public static void main(String[] args)
    {
        // With Array.sort()
        /*String[] arr = {"apple", " ", "kiwi", "orange", "banana", "fig"};

        Arrays.sort(arr);

        for (String s : arr)
        {
            System.out.print(s + ",");
        }*/


        // Without Array.sort()
        String[] arr = {"apple", " ", "kiwi", "orange", "banana", "fig"};
        //String[] arr = {"apple", "kiwi", "orange", "banana", "fig"};

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i].compareTo(arr[j]) > 0)
                {
                    String t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print("\"" + arr[i] + "\" "); // O/P: " " "apple" "banana" "fig" "kiwi" "orange" 
            //System.out.print(arr[i] + " ");  // O/P:apple banana fig kiwi orange 
        }
    }
}
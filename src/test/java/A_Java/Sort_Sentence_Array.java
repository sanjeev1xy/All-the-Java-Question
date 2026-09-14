package A_Java;

import java.util.Arrays;

public class Sort_Sentence_Array
{
    public static void main(String[] args)
    {
/* only for Arrays.sort(arr),
Arrays.sort(arr, String.CASE_INSENSITIVE_ORDER) is 
needed only when the array contains mixed uppercase 
and lowercase letters and you want alphabetical 
sorting; otherwise, normal Arrays.sort(arr) is 
enough.*/

        // With Array.sort()    	
        //String[] arr = {"fig", " ", "kiwi", "orange", "banana", "apple"," "}; //Small Letter and spaces
    	//String[] arr = {"Fig", " ", "Kiwi", "Orange", "Banana", "Apple"," "}; //Capital Letter and spaces
    	String[] arr = {"Fig", " ", "Kiwi", "orange", "banana", "Apple"," "}; //Mixed letter(Small and Capital Letter) and spaces
        Arrays.sort(arr);
        //Arrays.sort(arr, String.CASE_INSENSITIVE_ORDER); //for Sort alphabetically 
                                                         // and Mixed letter(Small and Capital Letter) and spaces        
         for (String s : arr)     // Read each element
         {
            //System.out.println("["+s+"],");
            System.out.println(s+",");
         }


/*      // Without Array.sort()
    	//String[] arr = {"fig", " ", "kiwi", "orange", "banana", "apple"," "}; //Small Letter and spaces
    	//String[] arr = {"Fig", " ", "Kiwi", "Orange", "Banana", "Apple"," "}; //Capital Letter and spaces
    	String[] arr = {"Fig", " ", "Kiwi", "orange", "banana", "Apple"," "}; //Mixed letter(Small and Capital Letter) and spaces

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
           System.out.println("["+arr[i]+"],");
           //System.out.println(arr[i]+",");
        }*/
    }
}
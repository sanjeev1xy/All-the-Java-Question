package Danger_B;

import java.util.ArrayList;

public class G_Separate_positive_and_negative_numbers_from_an_array 
{
	public static void main(String[] args) 
	{
		//O/P:- [9, 6, 7, 3, 1, -2, -1, -9]
		
		int[] arr = {-2, 9, 6, -1, 7, 3, 1, -9};

        ArrayList<Integer> list = new ArrayList<>();

        // Add positive numbers
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] >= 0)
            {
                list.add(arr[i]);
            }
        }

        // Add negative numbers
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] < 0)
            {
                list.add(arr[i]);
            }
        }

        // Print result
        System.out.println(list);
		
	
    }

}

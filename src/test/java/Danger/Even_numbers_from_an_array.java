package Danger;

public class Even_numbers_from_an_array 
{
public static void main(String[] args) 
{
    int[] arr = {10, 23, 45, 66, 78, 91, 100};
    for (int num : arr) 
    {
        if (num % 2 == 0) 
        {
            System.out.println("Even numbers in the array are:"+num);
        }
    }
	
}
}

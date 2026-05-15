package Danger;

import java.util.Scanner;

public class Get_Highest_number_using_array 
{
public static void main(String[] args) 
{
	//I/P:Enter the size of the array:
	//I/P:5
	//I/P:Enter 5 numbers:
	//I/P:10 20 40 50 30-
	//O/P:The highest number in the array is: 50
	
	 Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size of the array:");
     int n = sc.nextInt();
     int[] number = new int[n];
     System.out.println("Enter " + n + " number:");
     for (int i = 0; i < n; i++) 
     {
         number[i] = sc.nextInt();
     }
     int max = number[0];
     for (int i = 1; i < n; i++) 
     {
         if (number[i] > max) 
         {
             max = number[i];
         }
     }
     System.out.println("The highest number in the array is: " + max);	
     
	//Method-2
    /* int[] number = {1, 2, 4, 5, 6};
     int max = number[0];
     for (int i = 1; i < number.length; i++) 
     {
         if (number[i] > max)
         {
             max = number[i];
         }
     }

     System.out.println("The Highest Number in the array is " + max);
     */
}
}

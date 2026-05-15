package Geeks_For_Geeks_Array;

public class A_Array_Alternate_Printing 
{
//function to print alternate elements of the aaray
	public static void printAlternate(int [] arr)
	{
		//Iterate over the array with a step of 2
		for(int i=0;i<arr.length;i+=2) //i+=2 that means print the array 1st index , 3rd index ,5th index like that
		{
			System.out.println(arr[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		int [] arr= {1,2,3,4,5,6,7,8,9}; //Example Array
		
		printAlternate(arr);
	}
}

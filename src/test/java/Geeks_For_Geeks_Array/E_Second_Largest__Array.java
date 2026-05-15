package Geeks_For_Geeks_Array;

public class E_Second_Largest__Array 
{
//Function to find the second largest element in the array
	public static int findSecondLargest(int [] arr)
	{
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		
		//Traverse the array to find the largest and second largest elements
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				secondLargest=largest;
				largest=arr[i];
			}
			else if(arr[i]>secondLargest&&arr[i]!=largest)
			{
				secondLargest=arr[i];
			}
		}
		return secondLargest;
	}
	public static void main(String[] args) 
	{
		int []arr= {3,5,7,2,8,6,4,10};  //Example of array
		
		int secondlargest=findSecondLargest(arr);
		
		System.out.println("Second Largest: "+secondlargest);
	}
}

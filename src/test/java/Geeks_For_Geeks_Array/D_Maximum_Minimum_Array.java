package Geeks_For_Geeks_Array;

public class D_Maximum_Minimum_Array 
{
//Function to find maximum and minimum in an array
	public static void findMaxMin(int []arr)
	{
		int max=arr[0]; // initialize max as the first element 
		int min=arr[0]; // initialize min as the first element
		
		//Traverse the array to find max and min
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i]; //update max if current element is greater 
			}
			if(arr[i]<min)
			{
				min=arr[i]; //update min if current element is greater 
			}
		}
		System.out.println("Maximum: "+max);
		System.out.println("Minimum: "+min);
	}
	public static void main(String[] args) 
	{
		int []arr= {3,5,7,2,8,-1,4,10}; //Example array
		
		findMaxMin(arr);
	}
}

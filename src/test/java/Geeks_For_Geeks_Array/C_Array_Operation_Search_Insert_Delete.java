package Geeks_For_Geeks_Array;

public class C_Array_Operation_Search_Insert_Delete 
{
	//Function to search for an element x in the array
public static boolean searchElement(int[] arr,int x)
{
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==x)
		{
			return true; // element found
		}
	}
	return false; //element not found
}

//Function to insert an element y at index yi in the array
public static boolean insertElement(int[] arr,int y,int yi)
{
	//check if index is within bounds
	if(yi>=0 && yi<arr.length)
	{
		//shift elements to the right
		for(int i=arr.length-1;i>yi;i--)
		{
			arr[i]=arr[i-1];
		}
		//insert the element
		arr[yi]=y;
		return true;
	}
	return false; //insertion failed
}

//Function to delete the first occurrence of an element z in the array
public static boolean deleteElement(int[] arr,int z)
{
	//Traverse the array to find the element
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==z)
		{
			//shift elements to the left
			for(int j=i;j<arr.length-1;j++)
			{
				arr[j]=arr[j+1];
			}
			arr[arr.length-1]=0; //clear the last element
			return true;
		}
	}
	return false; //deletion failed
}

public static void main(String[] args) 
{
//Define the fixed-size array with extra space for insertion
	int [] arr=new int[10];
	arr[0]=1;
	arr[1]=2;
	arr[2]=3;
	arr[3]=4;
	arr[4]=5;
	
	//search for element 3
	System.out.println(searchElement(arr, 3)); //output true
	
	//Insert element 10 at index 2
	System.out.println(insertElement(arr, 10, 2));//output true
	
	//print array after insertion
	for(int i:arr)
	{
		System.out.println(i+ "  "); //output 1 2 10 3 4 5 0 0 0 0
	}
	System.out.println();
	
	//delete element 3
	
	System.out.println(deleteElement(arr, 3));//output true
	
	//print array after declaration
	for(int i:arr)
	{
		System.out.println(i+"  "); //1 2 10 4 5 0 0 0 0 0
	}
	System.out.println();
}
}

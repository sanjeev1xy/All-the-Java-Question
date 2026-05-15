package Danger1;

public class Integer_Array_Sort_Without_Using_Inbuild_Method 
{
public static void main(String[] args) 
{
	//I/P:-1,0,-2,-9,2,3,4,5
	//O/P:-9 -2 -1 0 2 3 4 5
	
int [] arr= {-1,0,-2,-9,2,3,4,5};
for(int i=0;i<arr.length;i++)
{
	for(int j=i+1;j<arr.length;j++)
	{
		if(arr[i]>arr[j])
		{
			int t=arr[i];
			arr[i]=arr[j];
			arr[j]=t;
		}
	}
}
for(int i=0;i<arr.length;i++)
{
	System.out.print(arr[i]+" ");
}
}
}

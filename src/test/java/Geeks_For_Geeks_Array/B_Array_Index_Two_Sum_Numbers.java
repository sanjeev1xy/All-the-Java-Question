package Geeks_For_Geeks_Array;

public class B_Array_Index_Two_Sum_Numbers 
{
public static int [] twosum(int[]arr,int target)
{
	for(int i=0;i<arr.length;i++)	
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]+arr[j]==target)
				return new int [] {i,j};
		}
	}
	return new int [] {-1,-1};
}
public static void main(String[] args) 
{
int [] arr= {1,2,5,6,7};
int target=12; //indices should be in output =2,4
int [] sanj=twosum(arr, target);
System.out.println("indices:"+sanj[0]+","+sanj[1]);
}
}

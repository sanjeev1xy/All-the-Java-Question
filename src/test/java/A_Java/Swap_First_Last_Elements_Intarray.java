package A_Java;

import java.util.Arrays;

public class Swap_First_Last_Elements_Intarray
{
public static void main(String[] args) 
{
//O/P={5,2,3,4,1}
	
int [] arr= {1,2,3,4,5};
int size=arr.length;
int temp=arr[0];
arr[0]=arr[size-1];
arr[size-1]=temp;
System.out.println(Arrays.toString(arr));
}
}

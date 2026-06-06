package A_Java;

import java.util.Arrays;

public class Smallest_and_Secondsmallest_Element_Array 
{
public static void main(String[] args) 
{
int [] arr= {1,-1,4,5,6,7,9};
int n=arr.length;
System.out.println("length of array is "+n);
Arrays.sort(arr);
System.out.println("Smallest Element is "+arr[0]);
System.out.println("Secondsmallest Element is "+arr[1]);
}
}

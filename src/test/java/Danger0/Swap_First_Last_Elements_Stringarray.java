package Danger0;

import java.util.Arrays;

public class Swap_First_Last_Elements_Stringarray 
{
public static void main(String[] args) 
{
	//I/P:{"My","name","is","Sanjeev"}
	//O/P:[Sanjeev, name, is, My]
	
	String [] arr= {"My","name","is","Sanjeev"};
	int size=arr.length;
	String temp=arr[0];
	arr[0]=arr[size-1];
	arr[size-1]=temp;
	System.out.println(Arrays.toString(arr));
}
}

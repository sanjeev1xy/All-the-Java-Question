package Danger1;

public class Product_Array_Except_Self_Leet_Code 
{
	//I/P={1,2,3,4}
	//O/P=24 12 8 6
	
public static void prodArray(int a [] , int n)
{
	int p[]=new int[n] , prod=1;
	
	//find product of all elements of a[]
	for(int i=0;i<n;i++)
	{
		prod=prod*a[i];
	}
	for(int i=0;i<n;i++)
	{
		p[i]=prod/a[i];
	}
	for(int i=0;i<n;i++)
	{
		System.out.println(p[i]+" ");
	}
}
public static void main(String[] args) 
{
int a[]= {1,2,3,4};
int n=a.length;
prodArray(a, n);
}
}

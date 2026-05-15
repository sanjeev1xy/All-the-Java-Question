package Danger;

public class Sort_Binary_Array 
{
	//I/P={0,1,0,1,0,1};
	//O/P= {0,0,0,1,1,1}
	
	public static void sortbinaryaraay(int a[],int n)
	{
		int j=-1;
		for(int i=0;i<n;i++)
		{
			//if number is smaller then 1 then 
			//swap it with jth number
			if(a[i]<1)
			{
				j++;
				int temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
		}
	}
	public static void main(String[] args) 
	{
		int []a= {0,1,0,1,0,1};
		int n=a.length;
		//function call
		sortbinaryaraay(a, n);
		for(int i=0;i<n;i++)
		{ 
			System.out.print(a[i]+" ");
		}
	}
}

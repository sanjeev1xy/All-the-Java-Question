package A_Java;

public class Sort_Binary_Array_Move_0_at_the_beginning_With_Space 
{
	//I/P=0 0 0 0 0 2 4 5 1 6 3 
	//O/P=0 0 0 0 0 2 4 5 1 6 3 
	
	public static void short_Binary(int [] arr,int n)
	{
		int j=-1;
		for(int i=0;i<n;i++)
		{
			if(arr[i]<1)
			{
			j++;
			int t=arr[j];
			arr[j]=arr[i];
			arr[i]=t;
			}
		}
	}
	public static void main(String[] args) 
	{
		int [] arr= {1,0,2,0,3,0,4,5,0,6,0};
		int n=arr.length;
		short_Binary(arr, n);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+ " ");
		}
}
}

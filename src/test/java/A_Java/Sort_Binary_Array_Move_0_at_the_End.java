package A_Java;

public class Sort_Binary_Array_Move_0_at_the_End 
{
	//I/P:1,0,2,0,3,0,4,5,0,6,0
	//O/P:1 2 3 4 5 6 0 0 0 0 0 
	 public static void moveZerosToEnd(int[] arr, int n) 
	 {
			int j=-1;
			for(int i=0;i<n;i++)
			{
				if(arr[i]!=0)
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
			//Move all 0’s to the end
			int [] arr= {1,0,2,0,3,0,4,5,0,6,0};
			int n=arr.length;
			moveZerosToEnd(arr, n);
			for(int i=0;i<n;i++)
			{
				System.out.print(arr[i]+ " ");
			}
		}
}

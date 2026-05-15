package Danger1;

public class Missing_Number_Array
{
public static void main(String[] args) 
{
//Array Should not have duplicates
//Array no need to be sorted order
//value should be in the range
	
	//int [] intarr= {1,2,4,5};
	int [] intarr= {5,7,8,6,4,2};
	//logic
	//1+2+4+5=12 sum1
	//1+2+3+4+5=15  sum2
	//sum2-sum1=15-12=3 Missing
	
	int sum1=0;
	for(int i=0;i<intarr.length;i++)
	{
		sum1=sum1+intarr[i];
	}
	System.out.println("sum of elements of the array : "+sum1);
	
	int sum2=0;
	for(int i=2;i<=8;i++)
	{
		sum2=sum2+i;
	}
	System.out.println("Sum of the range of elements in the array:  "+sum2);
	System.out.println("Missing number is : "+(sum2-sum1));
}
}

package A_Java;

import java.util.Arrays;

public class Smallest_and_Secondsmallest_Element_Array 
{
public static void main(String[] args) 
{
//With Using Arrays.sort() method
int [] arr= {1,-1,4,5,6,7,9,0};
int n=arr.length;
System.out.println("length of array is "+n);
Arrays.sort(arr);
System.out.println("Smallest Element is "+arr[0]);
System.out.println("Secondsmallest Element is "+arr[1]);

/*
//Without Using Arrays.sort() method

int[] arr={1,-1,-2,2,9,8,4,6};
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
System.out.println("Smallest number is "+arr[0]);
System.out.println("Second Smallest Number is "+arr[1]);
*/
}
}

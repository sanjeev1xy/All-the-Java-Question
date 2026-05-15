package Danger0;

public class Sum_All_Numbers_Array
{
public static void main(String[] args) 
{
	int[] n = {1, 2, 3, 4};
    int sum = 0;

    for(int i = 0; i < n.length; i++)
    {
        sum = sum + n[i];
    }

    System.out.println(sum);
}
}

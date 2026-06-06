package A_Java;

public class String_Assign_5 
{
//I/P=1010101
//O/P=1111000
	
	public static void sort_binary(int a[], int n)
    {
        int j = -1;
        for (int i = 0; i < n; i++)
        {
            if (a[i]!=0)
            {
                j++;
                int t = a[j];
                a[j] = a[i];
                a[i] = t;
            }
        }
    }

    public static void main(String[] args)
    {
    	int []a= {1,0,1,0,1,0,1};
		int n=a.length;
		sort_binary(a, n);
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]);
		}
    }
}

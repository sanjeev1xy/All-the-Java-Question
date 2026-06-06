package B_Pattern;

public class VVI_K_Star_Patteren_Blank_Square_Rectangle_Patteren 
{
    // *****
	// *   *
   	// *   *
	// *   *
	// *****
	
	public static void main(String[] args)
	{
		int n = 5;
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        if(i==0 || i==n-1 || j==0 || j==n-1)
		            System.out.print("*");
		        else
		            System.out.print(" ");
		    }
		    System.out.println();
		}
	}
}

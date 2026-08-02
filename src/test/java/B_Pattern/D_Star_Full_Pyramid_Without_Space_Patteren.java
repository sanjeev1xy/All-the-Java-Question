package B_Pattern;

public class D_Star_Full_Pyramid_Without_Space_Patteren 
{
    //                    *
	//                   ***
	//                  *****   
	//                 *******
	//                *********
	
	public static void main(String[] args) 
	{
		int n = 5;
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<2*n;j++)
		    {
		        if(j>=n-i && j<=n+i)
		            System.out.print("*");
		        else
		            System.out.print(" ");
		    }
		    System.out.println();
		}
	}
}

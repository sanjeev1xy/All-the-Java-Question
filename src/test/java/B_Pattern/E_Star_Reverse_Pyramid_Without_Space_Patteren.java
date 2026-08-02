package B_Pattern;

public class E_Star_Reverse_Pyramid_Without_Space_Patteren 
{
    //          *********
	//           *******
	//            *****
	//             ***
	//              *
	
	public static void main(String[] args) 
	{
		int n = 5;
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<2*n;j++)
		    {
		        if(j>=i && j<=2*n-i-2)
		            System.out.print("*");
		        else
		            System.out.print(" ");
		    }
		    System.out.println();
		}
	}
}

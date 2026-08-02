package B_Pattern;

public class G_Star_Diagonal_Pattern 
{
	//*
	 //*
	  //*
	   //*
	    //*
	
	public static void main(String[] args) 
	{
		int n = 5;
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        if(i==j)
		            System.out.print("*");
		        else
		            System.out.print(" ");
		    }
		    System.out.println();
		}
	}
}

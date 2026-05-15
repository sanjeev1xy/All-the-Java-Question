package Danger2;

public class VVI_B1_Star_Diagonal_Start_from_Left_Side 
{
    //*
   //*
  //*
 //*
//*

	public static void main(String[] args) 
	{
		int n = 5;

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(i + j == n - 1)   // 🔥 Only this condition changed
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
	}

}

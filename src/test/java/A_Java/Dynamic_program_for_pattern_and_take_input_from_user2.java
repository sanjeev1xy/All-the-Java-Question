package A_Java;

import java.util.Scanner;

public class Dynamic_program_for_pattern_and_take_input_from_user2 
{
//I/P:Plz.Enter a Value
//I/P:5

//O/P:	
//0123*5
//012*45
//01*345
//0*2345
//*12345
	
	public static void main(String[] args) 
    {
		int n = 5;

		for (int i = 0; i < n; i++) 
		{
		    for (int j = 0; j <= n; j++) 
		    {
		        if (j == n - i - 1)
		            System.out.print("*");
		        else
		            System.out.print(j);
		    }
		    System.out.println();
		}
    }
}

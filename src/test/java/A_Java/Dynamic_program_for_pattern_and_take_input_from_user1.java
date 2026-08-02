package A_Java;

import java.util.Scanner;

public class Dynamic_program_for_pattern_and_take_input_from_user1 
{
//I/P:Plz.Enter a Value
//I/P:5
	
//O/P:
//0000*0
//111*11
//22*222
//3*3333
//*44444
	
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
		            System.out.print(i);
		    }
		    System.out.println();
		}
    }

}

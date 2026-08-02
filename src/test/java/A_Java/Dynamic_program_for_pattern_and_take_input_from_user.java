package A_Java;

import java.util.Scanner;

public class Dynamic_program_for_pattern_and_take_input_from_user 
{
//I/P:Plz.Enter a Value
//I/P:5

//O/P:
//1234*6
//123*56
//12*456
//1*3456
//*23456
	
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
		            System.out.print(j+1);
		    }
		    System.out.println();
		}
    }
}

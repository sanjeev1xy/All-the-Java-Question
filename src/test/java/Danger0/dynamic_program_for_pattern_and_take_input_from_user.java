package Danger0;

import java.util.Scanner;

public class dynamic_program_for_pattern_and_take_input_from_user 
{
//I/P:Plz.Enter a Value
//I/P:5
	
//1234*6
//123*56
//12*456
//1*3456
//*23456
	
	public static void main(String[] args) 
    {
		System.out.print("Plz.Enter a Value");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) 
        {
            for (int j = 1; j <= n + 1; j++) 
            {
                if (j == n - i) 
                {
                    System.out.print("*");
                } 
                else 
                {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}

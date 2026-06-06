package A_Java;

import java.util.Scanner;

public class Dynamic_Program_for_Pattern_and_Take_from_User1 
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
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }

}

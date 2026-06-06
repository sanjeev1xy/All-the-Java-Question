package A_Java;

import java.util.Scanner;

public class Correct_Logic_to_get_SINGLE_DIGIT_First_Digit 
{
public static void main(String[] args) 
{
	//I/P=4513
	//O/P=4
	
	System.out.println("Plz.Enter a value ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    while (n > 9)   // keep removing last digits
    {
        n = n / 10;
    }

    System.out.println(n);	
}
}

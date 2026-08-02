package A_Java;

import java.util.Scanner;

public class Correct_Logic_to_get_SINGLE_DIGIT_First_Digit 
{
public static void main(String[] args) 
{
	// I/P = 4513
    // First Digit = 4
    // Last Digit = 3
	
	int n=4513;

    while (n > 9)   
    {
        n=n/10;   //I want first digit 
        //n=n%10;   // I want last digit
    }
    System.out.println(n);
}
}

package A_Java;

public class Sum_Of_Digits_Until_Single_Digit 
{
public static void main(String[] args) 
{
	//I/P = 956
	//9 + 5 + 6 = 20
	//2 + 0 = 2
	//O/P = 2

	//I/P = 454
	//4 + 5 + 4 = 13
	//1 + 3 = 4
	//O/P = 4

	//I/P = 12345-1-2-3
	//12345 -1 = 12344
	//12344 -2 = 12342
	//12342 -3 = 12339
	//1 + 2 + 3 + 3 + 9 = 18
	//1 + 8 = 9
	//O/P = 9
	
	//int n = 12345-1-2-3
    //int n=956;
	int n=454;
    while (n > 9)   // run until single digit
    {            
        int sum = 0;
        while (n > 0)
        {
            sum = sum + n % 10;
            n = n / 10;
        }

        n = sum;  // assign sum back to n
    }

    System.out.println(n);  // single digit output
}
}

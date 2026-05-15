package Danger0;

public class Sum_in_Single_Digit_454 
{
public static void main(String[] args) 
{
	//I/P=956
	// 9+5+6 =20
	//O/P=2+0=2
	
	//I/P=454
	// 4+5+4=13
	//O/P=1+3=4
	
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

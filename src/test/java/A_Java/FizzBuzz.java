package A_Java;

public class FizzBuzz 
{
//say Fizz if the number is divisible by 3
//say Buzz if the number is divisible by 5
//say FizzBuzz if the number is divisible by both 3 and 5
//Return the number itself , if the number is not divisible by 3 and 5.
	public static void main(String[] args) 
	{
		int n=100;
		for(int i=1;i<=n;i++)
		{
			if(i%15==0)
			{
				System.out.println("FizzBuzz");
			}
			else if(i%3==0)
			{
				System.out.println("Fizz");
			}
			else if(i%5==0)
			{
				System.out.println("Buzz");
			}
			else
			{
				System.out.println(i);
			}
		}
	}
}

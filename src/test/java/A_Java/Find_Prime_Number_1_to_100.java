package A_Java;

public class Find_Prime_Number_1_to_100 
{
	public static void main(String[] args) 
	{
		// A prime number is a number that is greater than 1
		// and is divisible only by 1 and itself.
		
		// 2  ✔ Prime
		// 3  ✔ Prime
		// 4  ✘ Not Prime
		// 5  ✔ Prime
		// 6  ✘ Not Prime
		// 7  ✔ Prime
		
		for(int n=1; n<=100; n++)
		{
			int t=0;
			for(int i=2; i<n-1; i++)
			{
				if(n%i==0)
				{
					t=t+1;
				}
			}			
			if(t>0)
			{
				System.out.println("Not a prime Number");
			}
			else
			{
				if(n>1)
				{
					System.out.println(n);
				}
			}
		}
	}
}
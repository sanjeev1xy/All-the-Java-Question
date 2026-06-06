package A_Java;

import java.util.Scanner;

public class F_Prime_Number 
{
public static void main(String[] args) 
{
	//A prime number is a number that is greater than 1
	//and is divisible only by 1 and itself.
	
	//2	✔ Prime	Divisible by 1 and 2 only
	//4	✘ Not Prime	Divisible by 1, 2, 4 (more than 2 divisors)
	//7	✔ Prime	Divisible by 1 and 7 only
	//9	✘ Not Prime	Divisible by 1, 3, 9
	//13✔ Prime	Divisible by 1 and 13 only
	
	
	
System.out.println("Plz Enter the number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int t=0;

for(int i=2;i<n-1;i++)
{
	if(n%i==0)
	{
		t=t+1;
	}
}
if(t>0)
{
	System.out.println("Number is not prime number");
}
else
{
	System.out.println("Number is prime number");
}
}
}

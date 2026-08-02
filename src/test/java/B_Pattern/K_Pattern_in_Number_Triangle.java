package B_Pattern;

public class K_Pattern_in_Number_Triangle
{
	public static void main(String[] args) 
	{
		// 1
		// 12
		// 123
		// 1234
		// 12345
		
		int n = 5;

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                if(j <= i)   // 🔥 condition change only
                    System.out.print(j);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
		
		// 1
		// 22
		// 333
		// 4444
		// 55555
        
        int n1 = 5;

        for(int i = 1; i <= n1; i++)
        {
            for(int j = 1; j <= n1; j++)
            {
                if(j <= i)   // same condition
                    System.out.print(i);   // 🔥 only change here
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
		
	}	
}


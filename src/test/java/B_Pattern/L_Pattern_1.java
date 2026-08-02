package B_Pattern;

/*
      1
     1 1
    1   1
     1 1
      1
*/

public class L_Pattern_1
{
    public static void main(String[] args)
    {

        int n = 5;

        for(int i = 0; i < n; i++)          // Outer loop → Rows
        {
            for(int j = 0; j < n; j++)      // Inner loop → Columns
            {
                if(Math.abs(i - 2) + Math.abs(j - 2) == 2)
                    System.out.print("1");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
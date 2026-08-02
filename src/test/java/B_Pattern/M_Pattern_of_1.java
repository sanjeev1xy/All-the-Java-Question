package B_Pattern;

/*
1
1 1
1   1
1 1
1
*/

public class M_Pattern_of_1
{
    public static void main(String[] args)
    {
        int n = 5;

        for(int i = 0; i < n; i++)          // Outer loop → Rows
        {
            for(int j = 0; j < n; j++)      // Inner loop → Columns
            {
                if(j == 0 || (i == 1 && j == 2) || (i == 2 && j == 4) || (i == 3 && j == 2))
                    System.out.print("1");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
package A_Java;

public class Missing_Character_Find_String_Array 
{
public static void main(String[] args) 
{
	String [] s= {"abc","def","hij"};
    // First string = abcdefhij (missing g)
    int sum1 = 0;
    // Convert array of strings → sum of characters
    for(int i=0;i<s.length;i++)
    {
        char[] ch = s[i].toCharArray();     // convert string to characters
        for(char c : ch)
        {
            sum1 = sum1 + c;                 // add ASCII values
        }
    }
    System.out.println("Total of given characters = " + sum1);
    // Expected characters = a to j
    int sum2 = 0;
    for(char i='a'; i<='j'; i++)
    {
        sum2 = sum2 + i;
    }
    System.out.println("Total of expected characters = " + sum2);
    System.out.println("Missing character is : " + (char)(sum2-sum1));
}
}

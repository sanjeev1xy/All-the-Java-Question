package Danger;
public class Number_To_Words_IP_2025 
{
    public static void main(String[] args) 
    {
    	//ouput =two zero two five
    	
        int num = 2025;
        String s = String.valueOf(num);
        String[] words = {
                "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"
        };
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) 
        {
            int digit = s.charAt(i) - '0';// Convert char to number
            result.append(words[digit]).append(" ");
        }
         System.out.println(result.toString());
    }
}

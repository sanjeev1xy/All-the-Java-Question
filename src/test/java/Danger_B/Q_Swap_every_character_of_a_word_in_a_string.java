package Danger_B;

public class Q_Swap_every_character_of_a_word_in_a_string 
{
	public static void main(String[] args) 
	{
		//I/P:  String s = "welcome"
		//O/P: ewclmoe
		
        String s = "welcome";
        char[] ch = s.toCharArray();

        // Swap characters in pairs
        for(int i = 0; i < ch.length - 1; i += 2) 
       {
            char temp = ch[i];
            ch[i] = ch[i + 1];
            ch[i + 1] = temp;
        }

        // Print result
        System.out.println(new String(ch));
    }
}

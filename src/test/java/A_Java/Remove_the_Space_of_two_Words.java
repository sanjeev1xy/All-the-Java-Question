package A_Java;

public class Remove_the_Space_of_two_Words 
{
	public static void main(String[] args)
    {
		// I/P: RAINB       OW of Stars
		// O/P: RAINBOW of Stars
		
        String s = " RAINB       OW of Stars";
        // remove only spaces between RAINB and OW
        String s1 = s.replaceAll("RAINB\\s+OW", "RAINBOW");
        System.out.println(s1);
    }
}

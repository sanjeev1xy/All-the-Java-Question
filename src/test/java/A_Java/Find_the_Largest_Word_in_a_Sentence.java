package A_Java;

public class Find_the_Largest_Word_in_a_Sentence 
{
	public static void main(String[] args) 
	{
        String s = "Java Selenium Playwright API Automation Automationn";
        String[] words = s.split(" ");
        String largestWord = words[0];

        for (String word : words) 
        {
            if (word.length() > largestWord.length()) 
            {
                largestWord = word;
            }
        }

        System.out.println("Sentence: " + s);
        System.out.println("Largest Word: " + largestWord);
        System.out.println("Length: " + largestWord.length());
    }
}


package A_Java;

public class Find_the_Smallest_Word_in_a_Sentence 
{
    public static void main(String[] args) 
    {
        String s = "Java Selenium Playwright API Automation";
        String[] words = s.split(" ");
        String smallestWord = words[0];

        for (String word : words) 
        {
            if (word.length() < smallestWord.length()) 
            {
                smallestWord = word;
            }
        }

        System.out.println("Sentence: " + s);
        System.out.println("Smallest Word: " + smallestWord);
        System.out.println("Length: " + smallestWord.length());
    }
}

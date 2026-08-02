package A_Java;

import java.util.Scanner;

public class Reverse_order_of_words_in_string
{
//I/P=My name is Sanjeev
//O/P=Sanjeev is name My
	
//I/P=123 456
//O/P=456 123 	
	
//I/P=My Roll Number is 1388
//O/P=1388 is Number Roll My
	
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);          // Creates a Scanner object to take input from the keyboard.
    System.out.println("Please Enter the Value"); // Displays a message asking the user to enter a sentence.
    String s = sc.nextLine();                     // Reads the complete sentence entered by the user.
    String[] s1 = s.split(" ");                   // split(" ") breaks the sentence wherever it finds a space (" ").
	                                              // Each separated word is stored in the String array 's1'.
	                                              // Example:
	                                              // Input : "My name is Sanjeev"
	                                              // Output:
	                                              // s1[0] = "My"
	                                              // s1[1] = "name"
	                                              // s1[2] = "is"
	                                              // s1[3] = "Sanjeev"
	String revstr = "";                           // Creates an empty string to store the reversed sentence.
    for(int i = s1.length - 1; i >= 0; i--)       // Starts from the last word and moves toward the first word.
    {
	   revstr = revstr + s1[i] + " ";             // Appends each word to create the reversed sentence.
	}
    System.out.println(revstr);                   // Prints the reversed sentence.
}
}
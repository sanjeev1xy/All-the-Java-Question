package Danger_B;

public class D_Reverse_an_array_strings
{
	public static void main(String[] args) 
	{
//How do you reverse an array of strings in Java?
//We use a loop from last index to first index and \
//print elements in reverse order.

			String str[] = {"Hi", "Hello", "how are you"};
			for(int i = str.length - 1; i >= 0; i--)
			{
			    System.out.print(str[i] + " ");
			}

			
			//Output
			//how are you Hello Hi

//We reverse an array by looping from last index to first 
//index and printing elements.

}
}
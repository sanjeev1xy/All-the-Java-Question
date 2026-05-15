package Danger0;

import java.util.Arrays;
import java.util.List;

public class Lambda_Expression_Sorting 
{
public static void main(String[] args) 
{
	// Lambda with Runnable Interface
    Runnable r = () -> System.out.println("Lambda Expression in Core Java");
    r.run();

    // Lambda with List Sorting
    List<Integer> list = Arrays.asList(5, 2, 9, 1);

    // Sorting using Lambda
    list.sort((a, b) -> a - b);

    System.out.println("Sorted List: " + list);
}
}

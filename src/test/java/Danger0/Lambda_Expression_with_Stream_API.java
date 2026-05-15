package Danger0;

import java.util.Arrays;
import java.util.List;

public class Lambda_Expression_with_Stream_API 
{
    public static void main(String[] args) 
    {
        List<Integer> list = Arrays.asList(5, 10, 15, 20);
        list.stream()
            .filter(x -> x > 10)   // Lambda Expression
            .forEach(x -> System.out.println(x));  // Lambda Expression
    }
}

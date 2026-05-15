package Danger1;

import java.util.HashMap;
import java.util.Map;

/*
Why We Used Lambda Expression
Reduce Code (Main Reason)

Without lambda, sorting and printing need extra classes 
and loops.Lambda makes the code short and clean.
*/

public class Short_HashMap_Based_on_Values
{
    public static void main(String[] args) 
    {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("sanjeev", 100);
        map.put("Kumar", 20);
        map.put("Thakur", 150);
        map.put("skt", 10);
        map.put("tks", 3);
        map.put("sanjee", -1);

        map.entrySet()
           .stream()
           // ✅ Lambda Expression for sorting
           .sorted((e1, e2) -> e1.getValue() - e2.getValue())
           // ✅ Lambda Expression for printing
           .forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
    }
}

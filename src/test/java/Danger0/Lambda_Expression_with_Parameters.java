package Danger0;

// Functional Interface
interface Add 
{
    int sum(int a, int b);
}
public class Lambda_Expression_with_Parameters 
{
    public static void main(String[] args) 
    {
        // Lambda Expression with parameters
        Add obj = (a, b) -> a + b;
        System.out.println(obj.sum(10, 20));
    }
}

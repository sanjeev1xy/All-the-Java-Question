package Danger0;

// Functional Interface
interface MyInterface 
{
    void show();
}

public class Lambda_Functional_Interface 
{
    public static void main(String[] args) 
    {
        // Lambda Expression
        MyInterface obj = () -> System.out.println("Hello Lambda Expression");
        obj.show();   // calling method
    }
}

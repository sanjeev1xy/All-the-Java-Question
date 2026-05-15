package Danger3;

public class G_Static_Example 
{
static int a;
public void increment()
{
	a=a+1;
}
public static void abc()
{
	System.out.println("i am static");
}
public static void main(String[] args) 
{
System.out.println("********obj1********");
G_Static_Example obj1=new G_Static_Example();
obj1.increment();
System.out.println("Value of a "+obj1.a);
System.out.println("***********obj2************");
G_Static_Example obj2=new G_Static_Example();
obj2.increment();
System.out.println("Value of a "+obj2.a);
G_Static_Example.abc();
System.out.println(G_Static_Example.a);
}
}

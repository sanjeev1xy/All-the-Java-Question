package A_Java;

public class Try_Catch_Program 
{
public static void main(String[] args) 
{
try
{
	System.out.println("A");
	improperMethod();
	System.out.println("B");
}
catch(Throwable e)
{
	System.out.println("C");
}
finally
{
	System.out.println("D");
}
}
public static void improperMethod()
{
	throw new Error();
}
}

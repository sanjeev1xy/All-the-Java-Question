/*
this()
------
To call another constructor of the same class.
Reduces duplicate code.
Constructor chaining inside the same class.
	
super()
-------
To call the parent class constructor.
Parent object should be initialized before the child object.
Constructor chaining between parent and child classes.
	
this()  → Same Class
super() → Parent Class
or
this()  = Internal Constructor Call
super() = External (Parent) Constructor Call
or
this()  → Calls another constructor of the same class 
          (Internal Constructor Call)
super() → Calls a constructor of the immediate parent class 
          (External Constructor Call)

Note:-
------	
Always remember that this() and super() keywords execute from bottom to top during constructor chaining. 
Additionally, create the reference variable in the child class to properly observe the complete constructor execution sequence.
*/


package A_Java;

public class This_Super_Keyword_Parent_Constructor 
{	
public This_Super_Keyword_Parent_Constructor() 
{
	this(67,89,5);
	System.out.println("Parent default conatructor");
}
public This_Super_Keyword_Parent_Constructor(int a)
{
	this();
	System.out.println("parent single parametrized constructor");
}
public This_Super_Keyword_Parent_Constructor(int a,int b)
{
	this(9);
	System.out.println("parent two parametrized constructor");
}
public This_Super_Keyword_Parent_Constructor(int a,int b,int u)
{
	System.out.println("parent three parametrized constructor");
}
public This_Super_Keyword_Parent_Constructor(int a,int b,int u,int y)
{	
	this(1,2);
	System.out.println("parent Four parametrized constructor");
}
}

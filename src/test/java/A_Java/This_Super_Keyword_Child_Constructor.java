package A_Java;

public class This_Super_Keyword_Child_Constructor extends This_Super_Keyword_Parent_Constructor
{
/* OP: parent three parametrized constructor
       Parent default conatructor
       parent single parametrized constructor
       parent two parametrized constructor
       parent Four parametrized constructor
       child three parametrized constructor
       child default constructor
       child four parametrized constructor
       child single parametrized constructor
       child two parametrized constructor
*/
	
public This_Super_Keyword_Child_Constructor() 
{
	this(1,2,3);
System.out.println("child default constructor");
}
public This_Super_Keyword_Child_Constructor(int d)
{
	this(1,2,3,4);
	System.out.println("child single parametrized constructor");
}
public This_Super_Keyword_Child_Constructor(int t,int p)
{
	this(1);
	System.out.println("child two parametrized constructor");
}
public This_Super_Keyword_Child_Constructor(int t,int p,int r)
{
	super(1,2,3,4);
	System.out.println("child three parametrized constructor");
}
public This_Super_Keyword_Child_Constructor(int t,int p,int r,int d)
{
	this();
	System.out.println("child four parametrized constructor");
}
public static void main(String[] args) 
{
This_Super_Keyword_Child_Constructor s=new This_Super_Keyword_Child_Constructor(12,5);	
}
}

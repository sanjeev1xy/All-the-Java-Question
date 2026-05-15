package Danger1;

public class Parent_Child__Constructor_this_Super_Key 
{
public Parent_Child__Constructor_this_Super_Key() 
{
	this(1,2,3);
	System.out.println("Parent default conatructor");
}
public Parent_Child__Constructor_this_Super_Key(int a)
{
	this();
	System.out.println("parent single parametrized constructor");
}
public Parent_Child__Constructor_this_Super_Key(int a,int b)
{
	this(1);
	System.out.println("parent two parametrized constructor");
}
public Parent_Child__Constructor_this_Super_Key(int a,int b,int u)
{
	System.out.println("parent three parametrized constructor");
}
public Parent_Child__Constructor_this_Super_Key(int a,int b,int u,int y)
{
	this(1,2);
	System.out.println("parent Four parametrized constructor");
}
}

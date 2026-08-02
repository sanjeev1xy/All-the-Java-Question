 package A_Java;

import java.util.Scanner;

public interface Client 
{
void input(); //public + Abstract
void output(); //public + Abstract

public class Raju implements Client
{
	String name;
	double sal;
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username: ");
		String name=sc.nextLine();
		
		System.out.println("Enter salary:  ");
		double sal=sc.nextDouble();
	}
	public void output()
	{
		System.out.println(name+"   "+sal);
	}
}
public static void main(String[] args) 
{
Client c=new Raju(); //here we are creating object left interface and 
                     //right side class bcoz() under class everything implemention

c.input();
c.output();
}
}

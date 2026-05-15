package Danger1;

import java.util.HashSet;

public class Common_Array_With_two_Array 
{
public static void main(String[] args) 
{
int [] a= {1,2,3,4,5};
int [] b= {3,4,5,6};
HashSet<Integer>setA=new HashSet<Integer>();
for(int num:a)
{
	setA.add(num);
}
for(int num:b)
{
	if(setA.contains(num))
	{
		System.out.println(num);
	}
}

/*
String[]a= {"san","ku","th"};
String[]b= {"san","ku"};
HashSet<String>setA=new HashSet<String>();
for(String num:a)
{
	setA.add(num);
}
for(String num:b)
{
	if(setA.contains(num))
	{
		System.out.println(num);
	}
}
*/
}
}

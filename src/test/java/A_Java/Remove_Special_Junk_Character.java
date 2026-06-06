package A_Java;

import java.util.Scanner;

public class Remove_Special_Junk_Character
{
public static void main(String[] args) 
{
/*
System.out.println("Plz.Enter the Value");
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
*/
	
String s="SDHJKL:JKLfdsfds567489032#$%^&*()^&*@@@                 fghjkbcnmxRTYUIO!@#$%^&*        ";
String s1=s.replaceAll("[^a-zA-Z0-9]", ""); //with the help of regular expression and use replaceall function
System.out.println(s1);
}
}

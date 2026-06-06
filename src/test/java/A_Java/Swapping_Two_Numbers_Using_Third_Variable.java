package A_Java;

import java.util.Scanner;

public class Swapping_Two_Numbers_Using_Third_Variable 
{
public static void main(String[] args) 
{
System.out.println("Plz Enter the Value a & b");
Scanner sc=new Scanner(System.in); // System.in passed as a parameter in Scanner class , It tells the java compiler 
                                   // that system input will be provided through console(Keyboard)
int a=sc.nextInt();
int b=sc.nextInt();
int c;
System.out.println("Before Swapping Number is "+a+","+b);
c=b;
b=a;
a=c;
System.out.println("After Swapping numbers is "+a+","+b);
}
}

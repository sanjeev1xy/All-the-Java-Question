package A_Java;

import java.util.Scanner;

public class Table_Print 
{
public static void main(String[] args) 
{
System.out.println("Plz Enter the Number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=10;i++)
{
	System.out.println(n+"*"+i+"="+n*i);
}
}
}

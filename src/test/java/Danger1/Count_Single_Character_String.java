package Danger1;

public class Count_Single_Character_String 
{
public static void main(String[] args) 
{
String s="my name is sanjeev";
int Total_Length=s.length();
int Total_Length_Remove=s.replace("a", "").length();
int count=Total_Length-Total_Length_Remove;
System.out.println("Occurence of a "+count);

}
}

package Danger;


public class Remove_White_Spaces 
{
public static void main(String[] args) 
{
String s="my nameYOYOGHJKHJKHJKfds  gfkdjfkdHJJKHJKvc   FJDKLS              ";
//s is a regular that matches any white spaces character including space,tab and newline.By using replaceAll()
//we are able to remove all these white spaces characters, not just spaces.\\s exactly matches with white spaces
String s1=s.replaceAll("\\s", "");
System.out.println(s1);
}
}

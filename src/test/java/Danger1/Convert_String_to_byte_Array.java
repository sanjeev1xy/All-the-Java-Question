package Danger1;

import java.util.Arrays;

public class Convert_String_to_byte_Array 
{
public static void main(String[] args) 
{
String s="Sanjeev";
byte[]byt=s.getBytes();
System.out.println(Arrays.toString(byt));

byte[] b1= {'S','a','n','j','e','e','v'};
byte[] b2= {83, 97, 110, 106, 101, 101, 118};

String s1=new String(b1);
String s2=new String(b2);

System.out.println(s1);
System.out.println(s2);
}
}

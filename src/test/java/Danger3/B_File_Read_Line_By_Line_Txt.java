package Danger3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class B_File_Read_Line_By_Line_Txt 
{
	public static void main(String[] args) throws IOException
	{
File f=new File("../Thakur/A_File_Read_Text.txt"); 
FileReader fr=new FileReader(f); //FileReader is inbuilt java class and FileReader reading the data character by character
BufferedReader br=new BufferedReader(fr); // BufferedReader is inbuilt java class and BufferedReader reading the data line by line
String s;
while((s=br.readLine())!=null)
{
	System.out.println(s);
}
}
}
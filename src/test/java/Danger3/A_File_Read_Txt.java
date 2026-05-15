package Danger3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class A_File_Read_Txt 
{
  //File=Connection Establish
	//FileReader=Character by character read
	//BufferedReader=Line by Line read
	//FileWriter=for writing line
	//BufferedWriter=for writing multiple lines
	
	public static void main(String[] args) throws IOException 
	{
		File f=new File("../Thakur/A_File_Read_Text.txt");//make a connection between txt file and code and also paste the path
		
		FileReader fr=new FileReader(f); //FileReader is inbuilt java class and FileReader reading the data character by character
		int a;
		while((a=fr.read())!=-1)
		{
			System.out.print((char)a);
		}
	}
}

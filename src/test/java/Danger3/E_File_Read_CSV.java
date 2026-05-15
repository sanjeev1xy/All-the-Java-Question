package Danger3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class E_File_Read_CSV 
{
public static void main(String[] args) throws IOException 
{
File f=new File("../Thakur/E_File_Read_CSV.csv");
FileReader fr=new FileReader(f);
BufferedReader br=new BufferedReader(fr);
String s;
while((s=br.readLine())!=null)
{
	String []s1=s.split(",");
	for(int i=0;i<s1.length;i++)
	{
		System.out.print(s1[i]);
	}
}
}
}

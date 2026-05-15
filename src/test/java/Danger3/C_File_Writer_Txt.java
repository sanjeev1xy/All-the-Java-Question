package Danger3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class C_File_Writer_Txt 
{
	public static void main(String[] args) throws IOException 
	{
File f=new File("../Thakur/C_File_Writer_Txt.txt");
FileWriter fw=new FileWriter(f); //FileWriter is inbuilt java class and fileWriter write the data character by character by character
BufferedWriter bw=new BufferedWriter(fw); //BufferedWriter is inbuilt java class and BufferedWriter write the data next line
bw.write("Automation is very easy");
bw.newLine();
bw.write("I want to become Automation Expert");
bw.close();
}
}
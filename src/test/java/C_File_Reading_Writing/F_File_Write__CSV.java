package C_File_Reading_Writing;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class F_File_Write__CSV 
{
public static void main(String[] args) throws IOException 
{
	File f=new File("../Thakur/F_File_Write__CSV.csv");
	FileWriter fw=new FileWriter(f);
	BufferedWriter bw=new BufferedWriter(fw);
	for(int i=0;i<7;i++)
	{
		bw.write("Sanjeev");
		bw.write(",");
	}
	bw.close();
}
}

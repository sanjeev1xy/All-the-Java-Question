package C_File_Reading_Writing;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class D_File_Append_Txt 
{
public static void main(String[] args) throws IOException 
{
File f=new File("../Thakur/C_File_Writer_Txt.txt");
FileWriter fw=new FileWriter(f,true);
BufferedWriter bw=new BufferedWriter(fw);
bw.newLine();
bw.write("Anyhow i have to chane the job");
bw.newLine();
bw.write("Automation is very easy if you are practing");
bw.close();
}
}

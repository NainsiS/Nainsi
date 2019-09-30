package Pkg3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileClass2
	{
		
	public static void main(String[] args) throws IOException
	{
	File f= new File("C:\\Users\\hbss\\Desktop\\Nainsifile2.txt");
	FileWriter fw = new FileWriter(f);
	BufferedWriter bw= new BufferedWriter(fw);
	bw.write("i am learning java ");
	bw.newLine();
	bw.write("I am Nainsi");
	bw.newLine();
	bw.write("This is File handling");
	bw.newLine();
	bw.write("I am using java ");
	bw.newLine();
	bw.write("This is java project");
	bw.close();
	}
}

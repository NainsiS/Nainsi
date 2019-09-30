package Pkg3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileClass
{
	
    public static void main(String[] args) throws IOException
	{
	File f =new File("C:\\Users\\hbss\\Desktop\\Nainsifile.txt");
	FileReader fr= new FileReader(f);
	BufferedReader b= new BufferedReader(fr);
	String s;
	while((s=b.readLine())!=null)
    {
	System.out.println(s);	
    }
    }
	}
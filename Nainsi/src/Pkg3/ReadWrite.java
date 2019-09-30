package Pkg3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWrite
{
 public static void main(String[] args) throws IOException 
 {
  File f= new File("C:\\Users\\hbss\\Desktop\\Nainsifile2.txt");
  FileReader fr = new FileReader(f);
  BufferedReader br= new BufferedReader(fr);
  File f2= new File("C:\\Users\\hbss\\Desktop\\Nainsifile3.txt");
  FileWriter fw = new FileWriter(f2);
  BufferedWriter bw= new BufferedWriter(fw);
  String s;
  
  while ((s=br.readLine())!=null)
  {
	  bw.write(s);
	  bw.newLine();
	  System.out.println(s);
  }
      bw.close();
  
}
}

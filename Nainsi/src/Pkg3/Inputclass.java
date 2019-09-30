package Pkg3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Inputclass 
{
 public void writeinput() throws IOException 
 {
	 Scanner s = new Scanner(System.in);
	 System.out.println("Please enter input values");
	File x= new File("C:\\Users\\hbss\\Desktop\\Nainsifile2.txt");
	FileWriter y = new FileWriter(x);
	BufferedWriter z = new BufferedWriter(y);
	 for (int i=1; i<=8; i++)
	 {
		 String ss= s.next();
		 z.write(ss);
		 z.newLine();
	 }
	 s.close();
	 z.close();
		 
	 }
    public static void main(String[] args) throws IOException {
		Inputclass ic= new Inputclass();
		ic.writeinput();
	}
}


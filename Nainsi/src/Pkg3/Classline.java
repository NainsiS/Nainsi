package Pkg3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Classline
{
	public void readmethod (int line) throws IOException 
	{
		File n= new File("C:\\Users\\hbss\\Desktop\\Nainsifile2.txt");
		FileReader r= new FileReader(n);
		BufferedReader b= new BufferedReader(r);
		
		String s;
	    int i=0;
	    while((s=b.readLine())!=null)
	    {
	    i=i+1;
	    	if(i==line)
	    {
	    System.out.println(s);
	    }
	    }
	}
	   
	  public static void main(String[] args) throws IOException {
		
	    System.out.println("enter the line number");
		Scanner sc= new Scanner(System.in);
		sc.nextInt();
		Classline cl = new Classline();
		cl.readmethod(1);
	  }
		
		}


		
	

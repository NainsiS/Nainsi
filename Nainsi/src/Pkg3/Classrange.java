package Pkg3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Classrange
{
public void readmethod(int initial, int end) throws IOException
{
	File w= new File("C:\\Users\\hbss\\Desktop\\Nainsifile2.txt");
	FileReader x = new FileReader(w);
	BufferedReader y= new BufferedReader(x);
	
	String s;
	int i=0;
	while ((s=y.readLine())!=null)
	{
		i=i+1;
		if((i>=initial && i<=end))
		{
		System.out.println(s);
		
		}
	}
}
   public static void main(String[] args) throws IOException {
	   
	   System.out.println("enter the intial and end number");
	   Scanner sc= new Scanner(System.in);
	   sc.nextInt();
	   Classrange cr= new Classrange();
	   cr.readmethod(1,5);
	   
}
	
}


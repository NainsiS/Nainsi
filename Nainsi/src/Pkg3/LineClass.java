package Pkg3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class LineClass {
	
	public void readmethod(int line) throws FileNotFoundException 
	{
		File a= new File("C:\\Users\\hbss\\Desktop\\Nainsifile2.txt");
		FileReader b= new FileReader(a);
		BufferedReader c= new BufferedReader(b);
		 
		String s;
		int i=1;
		while((s=c.readLine())!=null)
         {
	     if(i==line)
	     {
	    	 System.out.println(s);
        }
	    
		public static Void main(String[] args)
		{
			FileReader g= new FileReader(g);
		}	
		}
	}

}

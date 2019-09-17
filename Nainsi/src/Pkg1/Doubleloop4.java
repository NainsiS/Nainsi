package Pkg1;

import java.util.Scanner;

public class Doubleloop4 {
	
	public static void main (String[] args)
	
	{
	
		int k=0 ;
		int j;
	    for (int i=1; i<=6; i++)
	    {
	        for ( j=1; j<=i; j++ )
	        {
	            
	            System.out.print(j+k);
	            
	            System.out.print(" ");
	        }
	        k=k+i;
	        
	    System.out.println();
		        }
		        }
}

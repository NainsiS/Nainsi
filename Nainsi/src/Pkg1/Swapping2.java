package Pkg1;

import java.util.Scanner;

public class Swapping2 {
	
	public void Swapp (int a, int b, int c)
	{
	
	 c=a;
	 a=b;
	 b=c;
	
	 System.out.println("print the value of"+a+","+b);
   }

     public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter first number");
	int a = sc.nextInt();
	System.out.println("Please enter second number");
	int b = sc .nextInt();
	System.out.println("Please enter third number");
	int c =sc .nextInt();
	Swapping Re = new Swapping();
	Re.Swap(a, b);
}
	
	 

}

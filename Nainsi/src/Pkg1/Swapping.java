package Pkg1;

import java.util.Scanner;

public class Swapping {
	
	public void  Swap (int a, int b)
	{
	
	 a=a+b;
	 b=a-b;
	 a=a-b;
	System.out.println("print the value of"+a+","+b);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter first number");
		int a = sc.nextInt();
		System.out.println("Please enter second number");
		int b = sc .nextInt();
		Swapping Re = new Swapping();
		Re.Swap(a, b);
	}
		
	
	
}

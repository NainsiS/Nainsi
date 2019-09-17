package Pkg1;

	import java.util.Scanner;

	public class Table {
	 public void Table(int b)
	 {   
	int a= 0; 
	int i;
	for (i=0; i<10; i++)
	{
	a=a+b;
	System.out.println(a);
	}
	 }
	 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Table tb=new Table();
	System.out.println("Please enter the number for table");
	int b= sc.nextInt();
	tb.Table(b);
	}
	}
	
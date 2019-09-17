package Pkg1;

public class Triangal 
{
 public static void main(String[] args) {
	 int rows = 5, k = 0;
     for(int i = 1; i <=5; ++i, k = 0) {
         for(int j = 1; j <= 5 - i; ++) {
             System.out.print("  ");
         }
         while(k != 2 * i - 1) {
             System.out.print("* ");
             ++k;
         }
         System.out.println();
     }
 }
}


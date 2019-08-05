package Pkg1;

public class Class1 {

	 public int add (int a , int b)
	 {
	 int c;
	 c=a+b;
	
	 return c;
	 }
	 
	public int sub (int a , int b)
     {
     int c;
    c=a-b;
   return c;
     }
 
    public int add (int a ,int b, int d)
    {
     int c ;
     c=a+b ;
     return c;
    }
    
    public int mul (int a, int b)
    {
      int c;
      c=a*b ;
      return c;
    }
    public void div (int a, int b)
    
    {
    	int c;
    	c=a/b;	
    	System.out.println("result print"+ c);
    }
    
  
    	
public static void main(String[] args) {
	Class1 obj= new Class1();
	   

	int x= obj.add(10,2);
	int x1= obj.sub(x ,2);
	int x3= obj.add(x1,2);
	int x4= obj.mul(x3,2);
	 obj.div(x4,2);
}
}
   
   
			   
			   
 
   
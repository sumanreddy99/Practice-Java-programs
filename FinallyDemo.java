import java.io.*;
import java.sql.*;
class FinallyDemo 
{
	public static void main(String[] args) 
	{
       try{      
     	System.out.println("--stmt1--");
		System.out.println(10/0);
		System.out.println("--stmt2--");
	   }
   catch(ArithmeticException e){ 

		
		System.out.println("catch2222");
	
}


finally{
	
		System.out.println("catch11111111111");
	}


System.out.println("hello");

}
}
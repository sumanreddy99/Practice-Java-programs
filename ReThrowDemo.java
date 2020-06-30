import java.io.*;
class ReThrowDemo 
{
	public static void main(String[] args) throws IOException
	{
      try{
		System.out.println(10/0);
	}
     catch(ArithmeticException e){
		//System.out.println("test");

     		
throw new IOException();
	 }

	}
}

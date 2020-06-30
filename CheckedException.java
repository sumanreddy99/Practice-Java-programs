
import java.io.*;
class CheckedException 
{
	public static void main(String[] args) 
	{


		try{
	   Thread.sleep(1000);
       PrintWriter pw= new PrintWriter("abc.txt");

	   pw.write("hello");
		}

		catch(FileNotFoundException e){

          e.printStackTrace();
		}

		catch(InterruptedException e){

          e.printStackTrace();
		}
		System.out.println("Hello World!");
	}
}

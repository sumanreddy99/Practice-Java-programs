import java.io.*;

class  TryWithResources
{
	public static void main(String[] args)  throws Exception
	{

       try(FileReader fr=new FileReader("abc.txt");
	       PrintWriter pw = new PrintWriter("input.txt")){

        fr=new FileReader("abc.txt");
		System.out.println("Hello World!");


	   }
	}
}

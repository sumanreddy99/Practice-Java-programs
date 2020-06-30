import java.io.*;

class Finally_ReturnDemo 
{
	public static void main(String[] args) 
	{
		  System.out.println(m1());
	 }
		
	public static int m1(){
       try{
        System.out.println(10/0);
		return 777;
	   }
	   catch(Exception e){
		  
		   System.out.println("catch");
		    //return 888;
	   }
   finally{
		System.out.println("finally");
	return 111;
	 } 
	 //return 999;
	}
  
  }


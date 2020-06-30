class  ThrowDemo extends Error
{

	//static NullPointerException ne =new NullPointerException("null");
//static ArithmeticException ae ;

	public static void main(String[] args) 
	{
	  
       //System.out.println(10/0);
        //throw new ArithmeticException("/ by zero");

       throw new ThrowDemo();
	   
	  // System.out.println("hello");

	
	}
}

class MultiCatch 
{
    static String s=null;


    static{
      
	  int x=10/2;
	  System.out.println(x);
	

	}
	public static void main(String[] args) 
	{
     try{
		
		 System.out.println(s.length());
	    
       
	    }
catch(Exception|ArithmeticException e){
	e.printStackTrace();
		System.out.println("Hello World!");
	}
	}
}

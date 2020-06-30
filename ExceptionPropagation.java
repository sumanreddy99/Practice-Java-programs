class ExceptionPropagation 
{
   public static void m1() throws Exception{
     
	 m2();

   }

   public static void m2() throws Exception{

    	System.out.println(10/0);
	 
   }

	public static void main(String[] args) throws Exception
	{

		m1();
		System.out.println("Hello World!");
	}
}

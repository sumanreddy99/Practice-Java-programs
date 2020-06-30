class FlowInNestedTryCatch 
{
	public static void main(String[] args) 
	{
		
try{

        System.out.println("outter try");
				try{

	     	    	   System.out.println("inner Try");
						}
				catch(Exception e){
     	    	    	System.out.println("catch1");

				}

				finally{
				       System.out.println(10/0);

				}

				System.out.println("world");

	}
catch(Exception e){
     System.out.println(10/0);

	}

finally{
     
       System.out.println("finnaly-2");
	}

	System.out.println("hi");

}

}
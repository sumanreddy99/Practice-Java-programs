// Exact method arrgument matched for both menthods but there is no relation between the method arrgument types. 

class OverloadingCase3 
{
    public void m1(String s){
System.out.println("String args");

	}
public void m1(StringBuffer sb){

	System.out.println("String buffer");
}

	public static void main(String[] args) 
	{

OverloadingCase3  o=new OverloadingCase3();
o.m1("suman"); // exact mathc ----- string args
o.m1(new StringBuffer("suman"));//exact match ------- String buffer
o.m1(null); // for both methods arguments are matched but there is no relation between the String and Stringbuffer

 
		System.out.println("Hello World!");
	}
}

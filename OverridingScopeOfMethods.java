class P
{
 public void m1(){

		System.out.println("p m1");
	
	}
}

class C extends P
{
	 void m1(){
	System.out.println("c m1");
	
	
	}
}


public class OverridingScopeOfMethods
{
	public static void main(String[] args) 
	{

P p=new  C();
p.m1();
		System.out.println("Hello World!");
	}
}

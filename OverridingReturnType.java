class P
{

	public int m1(){
	System.out.println("P M1()");
	return 1;
	}
}

class C extends P
{
	public int m1(){
	System.out.println("C M1()");
	return 10;
	}
}

class OverridingReturnType
  
{
	public static void main(String[] args) 
	{
		C c=new C();
		c.m1();

		P p=new C();
		p.m1();
		System.out.println("Hello World!");
	}
}
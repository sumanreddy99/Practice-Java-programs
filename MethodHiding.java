class P 
{

	public static void m1(){
    System.out.println("P M1()");
	
	}
}

class C extends P
{
public static void m1(){
System.out.println("C M1()");
	
	}
}

class MethodHiding {


	public static void main(String[] args) 
	{

		P p=new C();
        p.m1();
		System.out.println("Hello World!");
	}
}

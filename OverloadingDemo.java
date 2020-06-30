class P
{
	public void m1(int i){
	System.out.println("P m1()");
	
	}
}

class C extends P
{
private void m1(String s){
	System.out.println("C Class m1()");
	
	}
}

public class OverloadingDemo 
{
public static void main(String[] args) 
	{

		P p= new P();
//p.m1(10);

C c=new C();

//c.m1("String");

P p1=new C();
p1.m1('A');

		System.out.println("Hello World!");
	}
}

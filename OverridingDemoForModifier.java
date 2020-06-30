 class P
{
	public  void m1(){
		System.out.println("P M1()");
	
}
}

abstract class C extends P
{
	public abstract void m1();
}
public class OverridingDemoForModifier 
{
	public static void main(String[] args) 
	{

		P p1=new C();
        p1.m1();

		System.out.println("Hello World!");
	}
}

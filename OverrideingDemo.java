class P
{

public void m1(int i){

System.out.println("P class m1");

}
}
class C extends P
{
public void m1(int i){

System.out.println("C class m1");
}
}

public class OverrideingDemo
{
public static void main(String[] args) 
	{
P p=new P();
//p.m1(10);

C c=new C();
//c.m1(10);

P p1 =new C();
p1.m1(10);
	
		System.out.println("Hello World!");
	}
}

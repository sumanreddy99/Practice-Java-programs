class OverloadingAutoMaticPromotion 
{

	public void m1()
	{
System.out.println("no arg ");
	}

	public void m1(short i){

System.out.println("int - arg");
	}
	public void m1(float f){
System.out.println("double -arg");
	}
	public static void main(String[] args) 
	{
OverloadingAutoMaticPromotion o=new OverloadingAutoMaticPromotion();
o.m1();
o.m1(10);
o.m1(10.5f);
o.m1('r');
o.m1(101);

		System.out.println("Hello World!");
	}
}

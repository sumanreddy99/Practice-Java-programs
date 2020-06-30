class OverloadingWithVarArgs 
{

     public void m1(int i)
	{
		 System.out.println("General Method "+ i);
	}
public void m1(int ...i){

for(int a:i)
		 System.out.println("New Method "+ a);


}


	public static void main(String[] args) 
	{
OverloadingWithVarArgs o= new OverloadingWithVarArgs();

o.m1();// var args accept zero arguments
o.m1(10);// for argument both methos are marched but old version methos will always execute i.e. General Method
o.m1(10,20);// var args

		System.out.println("Hello World!");
	}
}

 
 abstract class P
 {
	 int x;
	 P(int x){
		 this.x=x;
		System.out.println("x"+x);

	 }
 }
 class C extends P
 {

	 C(int i){
		super(10); 
		System.out.println("c" +i);

	 }
 }
 
 
 
 
 class ConstructorWthAbstractDemo
{
//ConstructorDemo(){
//
// this(10);
// System.out.println("no arg");
//
//}
//ConstructorDemo(int i){
//System.out.println("int arg");
//
//}
	public static void main(String[] args) 
	{
//ConstructorDemo c1=new ConstructorDemo();
C c=new C(20);
		System.out.println();
	}

}////////////

 
 class P
 {
	 String name;
int i;
P(){
}
P(int i){
this.i=i;
}
}
 class C extends P
 {

C(String name){
//super(10);
 this.name=name;
 
 } 

 C(String name,int i){
//super(i);
this(name);
 }
 
 }
 
 class ConstructorDemo
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
//
C c=new C("suman");
		System.out.println();
	}

}////////////

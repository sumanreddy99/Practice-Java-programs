class OverlodingHighestPriority 
{
   public void m1(Object o){
   
System.out.println("object - arg");
   }
public void m1(String s){

System.out.println("String arg");
}
	public static void main(String[] args) 
	{

		OverlodingHighestPriority o=new OverlodingHighestPriority();

		o.m1(new Thread());
		o.m1("suman");
		o.m1(null);// for both methods 'null' argument matched and there is a relation between the Object and String
		System.out.println("Hello World!");
	}
}

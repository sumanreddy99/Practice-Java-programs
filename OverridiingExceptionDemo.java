import java.io.*;

class  P
{
public void m1() throws ArithmeticException ,NullPointerException{
System.out.println("OverridiingExceptionDemo m1()");
}
}
class C extends P{

public void m1() throws IOException{
System.out.println("OverridiingExceptionDemo m1()");
}


	
}

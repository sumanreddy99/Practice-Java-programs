import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StaticInitializerBlockDemo{

//Write your code here
static int B;
static int H;
static boolean flag=true;
static{
Scanner s=new Scanner(System.in);
     try{

        B=s.nextInt() ;
       
        H=s.nextInt();
        if(B<=0 || H<=0){
        flag=false;
        throw new Exception("Breadth and height must be positive");
        }
        }

        catch(Exception e){

        System.out.println (e);
        }
        
    
  
 }

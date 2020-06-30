import java.util.*;
import java.security.*;
public class IntegerToStringDemo {
 public static void main(String[] args) {

  

  try {
   Scanner in = new Scanner(System.in);
   int n = in .nextInt();
   in.close();
   //String s=???; Complete this line below

   //Write your code here
  

      
      String s=String.valueOf(n);
   
   if (n == Integer.parseInt(s)) {
    System.out.println("Good job");
   } else {
    System.out.println("Wrong answer.");
   }
  
 }
}
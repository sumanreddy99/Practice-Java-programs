import java.util.Scanner;

public class OutputFormatDemo {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");

            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this
                      
             s1 = String. format("%-15s", s1);
                   
      // %03 means total length of number would be 3
     // if number is of 2 or 1 digits, rest of them will be padded by leading zeros.
         String x1 = String.format("%03d", x);
        
      System.out.println(s1+""+x1);
      //   }
            }
            System.out.println("================================");

    }
}
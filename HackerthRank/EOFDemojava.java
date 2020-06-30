import java.io.*;
import java.util.*;

public class EOFDemo {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        
        int i=1;
        while(s.hasNext()){//It returns true if this scanner has another token in its input.

              //next() : It is used to get the next complete token from the scanner which is in use.

        System.out.println(i +" "+s.nextLine());//It is used to get the input string that was skipped of the Scanner object.

        i++;
       }
    }
}
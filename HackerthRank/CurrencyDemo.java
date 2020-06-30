import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CurrencyDemo {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        Locale indiaLocale= new Locale("en","IN");
NumberFormat  n=  NumberFormat.getCurrencyInstance(Locale.US);
NumberFormat n1= NumberFormat.getCurrencyInstance(indiaLocale);
NumberFormat n2= NumberFormat.getCurrencyInstance(Locale.CHINA);
NumberFormat n3= NumberFormat.getCurrencyInstance(Locale.FRANCE);

                    // Write your code here.
        
        System.out.println("US: " + n.format(payment));
        System.out.println("India: " + n1.format(payment));
        System.out.println("China: " + n2.format(payment));
        System.out.println("France: " + n3.format(payment));
    }
}
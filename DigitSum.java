import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DigitSum {

    // Complete the superDigit function below.
    static int superDigit(String n, int k) {

            int result = 0;
            long sum = 0;
            String s = "";
            if(n.length() > 0) {
                s = n;
                for(int i = 1;i<k;i++) {
                    s = s + n;
                    System.out.println(s);
                }
                sum = getSum(s);
                System.out.println("function output"+ sum);
                result = (int)sum;
            }

            return result;

    }
    static long getSum(String n) {
        long result = 0;
        System.out.println(n+ " get sum "+ n.length());
        if(n.length() == 1) {
            System.out.println("inside single character string");
            result = Long.parseLong(n.charAt(0)+"");
            System.out.println(result);
            return result;
        }
        else {
            for(int i = 0;i<n.length();i++) {
                long temp = 0;
                String tt = n.charAt(i)+"";
                temp = Long.parseLong(tt);
              //  System.out.println(temp+ " in loop");
                result = result + temp;
            }
            n = ""+result;
            //System.out.println(n+"   result   "+n.length());
            return getSum(n);
        }
        //System.out.println("recurssion calling"+ result);
        //return result;
    }
  

    public static void main(String[] args) throws IOException {

        String n = "14";

        int k = 3;

        int result = superDigit(n, k);

        System.out.println(result);
    }
}

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MaximumSubArray {

    // Complete the maximumSum function below.
    static long maximumSum(long[] a, long m) {

      long max = 0;
       long s = 0;
       if(a.length>0) {
        max = a[0]%m;
        for(long i = 0;i<a.length;i++) {
            s = a[(int)i]%m;
                if(s>max) {
                    max = s;
                    }
                for(long j = i+1;j<a.length;j++) {
                          s = (s+a[(int)j])%m;
                          if(s>max) {
                              max = s;
                          }
            }
        }
       }
       return max;
    }



    public static void main(String[] args) throws IOException {
       
            long m = 7;

            long[] a = {3,3,9,9,5};

           
            long result = maximumSum(a, m);

         System.out.println(result);
    }
}
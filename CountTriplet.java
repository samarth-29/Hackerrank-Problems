  
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountTriplet {

    // Complete the countTriplets function below.
    static long countTriplets(long[] arr, long r) {
            Hashtable<Long, Long> ht = new Hashtable<Long, Long>();
            long counter = 0;
            for(int i =0; i< arr.length; i++) {
            counter = 0;
            if(ht.containsKey(arr[i])) {
               // System.out.println(i+"    "+note[i]+"   if");
                ht.put(arr[i], ht.get(arr[i])+1);
            }
            else {
                counter++;
               // System.out.println(i+"    "+note[i]+"  else");
                ht.put(arr[i], counter);
            }
        }
        
        counter = 0;
        for(int i = 0;i<arr.length;i++) {
              long temp = arr[i]*r;
              if(ht.containsKey(temp)) {
                temp = ht.get(temp);
                long temp2 = arr[i]*r*r;
                if(ht.containsKey(temp2)) {
                    temp2 = ht.get(temp2);
                    counter+= (temp*temp2);
                }
              }
        }
        return counter;
    }

    public static void main(String[] args) throws IOException {
      

        long arr [] = {1,2,2,4};
        
        long ans = countTriplets(arr, 2);
        System.out.println(ans);

    }
}
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LargestRectangle {

    // Complete the largestRectangle function below.
    static long largestRectangle(int[] h) {
        
        long max = 0;
        int counter = 0;
        long s = 0;
        long min = 0;
        if(h.length>0) {
            max = h[0];
            min  = h[0];
            for(int i = 0;i<h.length;i++) {
                counter = 1;
                s = (counter*h[i]);
                if(h[i]>min) {
                    min = h[i];
                }
                if(s>max){
                    max = s;
                }
                for(int j = i+1;j<h.length;j++) {
                    counter++;
                    if(h[j]<min) {
                        min = h[j];
                    }
                    // else {
                    //     min = h[i];
                    // }
                    s = (counter*min);
                    System.out.println(counter+"   "+s);
                    if(s>max) {
                        max = s;
                    }
                }
            }
        }
        return max;

    }

    

    public static void main(String[] args) throws IOException {
    

        int[] h = {3,2,3};
        long result = largestRectangle(h);
        System.out.println(result);
    }
}

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MarkandToys {

    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {

        int count = 0;
        if(prices!=null && prices.length!=0 && k!=0) {
            int sum = 0;
            Arrays.sort(prices);
            for(int i=0;i<prices.length;i++) {
                
                sum=sum+prices[i];
                if(sum>k) {
                    break;
                }
                count++;
            }
        }
        return count;
    }



    public static void main(String[] args) throws IOException {

        int k = 7;

        int[] prices = {2,4,3,1};


        int result = maximumToys(prices, k);

        System.out.println(result);

    }
}

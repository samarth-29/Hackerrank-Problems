import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the pairs function below.
    static int pairs(int k, int[] arr) {

            Arrays.sort(num);
        int count = 0;
        for(int i=0;i<num.length;i++){
          for(int j = i+1;j< num.length;j++){
            if(num[j] - num[i] == k || num[i] - num[j] == k){
              count++;
            }
            else if(num[j] - num[i] > k || num[i] - num[j] > k){
              break;
            }
          }
        }
        return count;
    }



    public static void main(String[] args) throws IOException {

        int k = 2;

        int[] arr ={1,5,3,4,2};


        int result = pairs(k, arr);

        System.out.println(result);
    }
}

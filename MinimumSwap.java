import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinimumSwap {

    // Complete the minimumSwaps function below.
    static int count = 0;
    static int minimumSwaps(int[] a, int m) {
    	
    	if(m==1)
    		return count;
    	
    	int max = a[0];
    	int k = 0;
    	for(int i=0;i<m;i++) {
    		if(a[i]>max) {
    			max = a[i];
    			k = i;
    		}
    	}
    	System.out.println("Maximum Element "+ max+" index "+k+"   "+m);
    	if(k+1!=m) {
    	int temp = a[m-1] ;
    	a[m-1] = max;
    	a[k] = temp;
    	count++;
    	}
    	return  minimumSwaps(a, m-1);

    }

    

    public static void main(String[] args) throws IOException {
        

        int n = 10;
       

        int[] arr = {3,7,6,9,1,8,10,4,2,5};
        int count = minimumSwaps(arr,arr.length);
        System.out.println(count);
       
    }
}

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ArrayLeftRotation {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
    	int result[]=null;
    	if(a.length==0)
    		return null;
    	else if (a.length==1)
    		return a;
    	else {
    		if(d<=a.length) {
    			result = new int[a.length];
    			int j=d;    			
    			for(int i=0;i<a.length;i++){
    				result[i] = a[j];
    				if(j==a.length-1) 
    					j=0;
    				else
    					j++;
    			}
    			
    		}
    	}
    return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        
        int d=4;
        int a[]=new int[5];
        for (int i = 0; i < 5; i++) {
            int aItem = scanner.nextInt();
            a[i] = aItem;
        }

        int[] result = rotLeft(a, d);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }

        

        scanner.close();
    }
}

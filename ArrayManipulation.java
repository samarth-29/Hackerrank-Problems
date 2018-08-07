import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class ArrayManipulation {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
      
      long a[]=new long[n+1];
      
      for(int i=1;i<=n;i++) {
      	a[i] = 0;
      }
      int k=0;
      for(int i = 0;i<queries.length;i++) {
      	for(int j = 0;j<1;j++) {
      		k = queries[i][j];
      		//System.out.println(k+ " "+queries[i][j+1]+" "+queries[i][j+2]+ " "+ (a[k]+queries[i][j+2]));
      		while(k<=queries[i][j+1]) {
      			
      			a[k] = a[k] + queries[i][j+2];
      			System.out.println(k+" "+a[k]);
      			k++;
      		}
      	}
      }	
      //long max = 0;
      long max=a[1];
      for(int i=1;i<a.length;i++) {
      	if(a[i]>max) {
      		max = a[i];
      	}
      }
      return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = 5;
        int[][] queries = new int[3][3];

        queries[0][0] = 1;
        queries[0][1] = 2;
        queries[0][2] = 100;
        queries[1][0] = 2;
        queries[1][1] = 5;
        queries[1][2] = 100;
        queries[2][0] = 3;
        queries[2][1] = 4;
        queries[2][2] = 100;

        long result = arrayManipulation(n, queries);

        System.out.println(result);

        scanner.close();
    }
}

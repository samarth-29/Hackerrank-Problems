import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Hourglass {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {

    	int max = Integer.MIN_VALUE;
    	int sum = 0;
    		for(int i=0;i<4;i++) {
    			for(int j=0;j<4;j++) {
    				sum= arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
    				max = Math.max(max,sum);
    			}
    		}
    	return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            
            for (int j = 0; j < 6; j++) {
                int arrItem = scanner.nextInt();
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        System.out.println(result);
    }
}

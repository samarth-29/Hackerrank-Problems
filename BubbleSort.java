import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BubbleSort {

    // Complete the countSwaps function below.
    static void countSwaps(int[] a) {
        int count = 0;
        if(a.length==0 || a==null) {
            System.out.println("Array is sorted in "+count+" swaps.");
            System.out.println("First Element: ");
            System.out.println("Last Element: ");
        }
        else if(a.length==1) {
            System.out.println("Array is sorted in "+1+" swaps.");
            System.out.println("First Element: "+a[0]);
            System.out.println("Last Element: "+a[0]);

        }
        else {
            for(int i=0;i<a.length;i++) {
                for(int j=0;j<a.length-1;j++) {
                    if(a[j]>a[j+1]){
                        int temp = a[j];
                        a[j]=a[j+1];
                        a[j+1] = temp;
                        count++;
                    }
                }
            }
            System.out.println("Array is sorted in "+count+" swaps.");
            System.out.println("First Element: "+a[0]);
            System.out.println("Last Element: "+a[a.length-1]);            
        }

    }

    

    public static void main(String[] args) {
       

        int[] a = {3,2,1};

        
        countSwaps(a);

        
    }
}
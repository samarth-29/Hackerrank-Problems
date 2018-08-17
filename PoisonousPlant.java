import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the poisonousPlants function below.
    static int poisonousPlants(int[] p) {

        ArrayList al =  new ArrayList();
        for(int i = 0;i<p.length;) {
            if(a[i]<a[i+1}) {
                al.add(a[i]);
                i+=2;
            }
            else {
                
            }
        }

    }

 

    public static void main(String[] args) throws IOException {
 
        int[] p = {6,5,8,4,7,10,9};

 
        int result = poisonousPlants(p);

        System.out.println(result); 
    }
}

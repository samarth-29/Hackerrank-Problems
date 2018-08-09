import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class AlternatingCharacters {

    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {

    	int count = 0;
    	int k = 0;
    	boolean flag=false;
    	outer:
    	for(int i = 0; i<s.length(); ) {
    		flag = false;
    		for(int j=i+1;j<s.length();j++) {
    			if(s.charAt(i) == s.charAt(j)) {
    				count++;
    		
    			}
    			else {
    				flag=true;
    				k = j;
    				break;
    			}


    			if(j==s.length()-1) {
    				break outer;
    			}
    		
    			
    		}
    		if(flag)
    			i = k;
    		else
    			i++;
    		
    	}
    	return count++;
    }



    public static void main(String[] args) throws IOException {
        
        	int result = alternatingCharacters("ABBABBAA");
            System.out.println(result);

    }
}

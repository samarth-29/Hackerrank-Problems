import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ValidString {

    // Complete the isValid function below.
    static String isValid(String s) {

        String result = "";
        Map<Character, Integer> frequencies = new HashMap<>();
        
        for(char letter : s.toCharArray())
        {
            if(frequencies.containsKey(letter))
                frequencies.put(letter, frequencies.get(letter) + 1);
            else
                frequencies.put(letter, 1);
        }
        
        
        
        Set<Integer> st = new HashSet<>();
        for(int freq : frequencies.values())
        {
            st.add(freq);
        }
        
        if(st.size() > 2)//More than 2 frequencies
            result = "NO";
        else if(st.size() == 1)
            result = "YES";
        else//2 different frequencies
        {
            int f1 = 0;
            int f2 = 0;
            int f1Count = 0;
            int f2Count = 0;
            int i = 0;
            for(int n : st)
            {
                if(i == 0) f1 = n;
                else f2 = n;
                i++;
            }
            
            for(int freq : frequencies.values())
            {
                if(freq == f1) f1Count++;
                if(freq == f2) f2Count++;
            }
            
            
            
            if((f1 == 1 && f1Count == 1 ) || (f2 == 1 && f2Count == 1 ))
                result = "YES";
            else if ((Math.abs(f1 - f2)  == 1) && (f1Count == 1 || f2Count == 1))
                result = "YES";
            else
                result = "NO";
        }
        return result;

    }



    public static void main(String[] args) throws IOException {
        

        String result = isValid("aabbcd");
        System.out.println(result);
        
    }
}
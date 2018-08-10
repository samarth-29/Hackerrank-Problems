import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TwoStrings {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        Hashtable<Character, Integer> ht = new Hashtable<Character, Integer>();
        int counter = 0;
        for(int i = 0;i<s1.length();i++) {
            counter = 0;
            if(ht.containsKey(s1.charAt(i))) {
                ht.put(s1.charAt(i), ht.get(s1.charAt(i))+1);
                //System.out.println(s1.charAt(i)+"    "+i+"    "+"if");
            }
            else {
                counter++;
                ht.put(s1.charAt(i), counter);
               // System.out.println(s1.charAt(i)+"    "+i+"    "+"else");
            }
        }
        Set<Character> nset1 = ht.keySet();
        Iterator<Character> it1 = nset1.iterator();
        while(it1.hasNext()) {
            char key = it1.next();
            System.out.println(key+"      "+ht.get(key));
        }
        for(int i=0; i<s2.length();i++) {
            if(ht.containsKey(s2.charAt(i))) {
                return "YES";
            }
        }
        return "NO";
    }

    

    public static void main(String[] args) throws IOException {
          

            String result = twoStrings("be", "cat");
            System.out.println(result);
    }
}
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MakingAnagrams {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        int c1[]=new int[26];
        int c2[]=new int[26];

        for(int i=0; i<a.length(); i++) {
            c1[a.charAt(i) - 'a']++;
        }

        for(int i=0; i<b.length(); i++) {
            c2[b.charAt(i) - 'a']++;
        }
        int result = 0;
        for(int i=0; i<26; i++) {
            result = result + Math.abs(c1[i]-c2[i]);
        }
        return result;
    }

    

    public static void main(String[] args) throws IOException {
    
        int result = makeAnagram("cde", "abc");

        System.out.println(result);
    }
}
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Ransome {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {

        boolean status = false;
        Hashtable<String,Integer> mtable =  new Hashtable<String,Integer>();
        Hashtable<String,Integer> ntable =  new Hashtable<String,Integer>();
        int counter = 0;
        for(int i =0; i< magazine.length; i++) {
            counter = 0;
            if(mtable.contains(magazine[i])) {
                mtable.put(magazine[i], mtable.get(magazine[i])+1);
            }
            else {
                counter++;
                mtable.put(magazine[i], counter);
            }
        }
        for(int i =0; i< note.length; i++) {
            counter = 0;
            if(ntable.containsKey(note[i])) {
               // System.out.println(i+"    "+note[i]+"   if");
                ntable.put(note[i], ntable.get(note[i])+1);
            }
            else {
                counter++;
               // System.out.println(i+"    "+note[i]+"  else");
                ntable.put(note[i], counter);
            }
        }
        // Set<String> nset1 = ntable.keySet();
        // Iterator<String> it1 = nset1.iterator();
        // while(it1.hasNext()) {
        //     String key = it1.next();
        //     System.out.println(key+"      "+ntable.get(key));
        // }
        Set<String> nset = ntable.keySet();
        Iterator<String> it = nset.iterator();
        while(it.hasNext()) {
            String key = it.next();
            if(mtable.containsKey(key)) {
                if(mtable.get(key) == ntable.get(key)) {
                    status = true;
                }
                else {
                    status = false;
                    break;
                }
            }
            else {
                status = false;
                break;
            }
        }
        if(status) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }



    public static void main(String[] args) {

        String[] magazine = {"two", "times", "three", "is", "not", "four"};

         String[] note = {"two", "times", "two", "is", "four"};

        checkMagazine(magazine, note);


    }
}
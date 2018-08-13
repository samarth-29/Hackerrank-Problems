import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class IcecreameParlour {

    // Complete the whatFlavors function below.
    static void whatFlavors(int[] arr, int money) {

        if (arr == null || arr.length < 1) {
            System.out.println(-1 + " " + -1);
            return;
        }

        // core logic
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < money) {
                if (hashMap.containsKey(money - arr[i])) {
                    int index = hashMap.get(money - arr[i]);
                    System.out.println((index + 1) + " " + (i + 1));
                    return;
                }

                if (!hashMap.containsKey(arr[i])) {
                    hashMap.put(arr[i], i);
                }
            }
        }

    }

    

    public static void main(String[] args) {
            int money = 4;
            int[] cost = {2,2,4,3};

            whatFlavors(cost, money);
        

        
    }
}

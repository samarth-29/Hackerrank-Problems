import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class FradulentActivityNotification {

    // Complete the activityNotifications function below.
    static int activityNotifications(int[] expenditure, int d) {

            int result = 0;
            int tempArray [] = new int[d];
            int dcounter = d;
            int temp = 0;


            for(int i = d; i< expenditure.length;i++) {
                temp = expenditure[dcounter];
                int counter = 0;
                for(int j = dcounter-d;j<dcounter;j++) {
                    tempArray[counter] = expenditure[j];
                    counter++;
                }
                // for(int k=0;k<tempArray.length;k++) {
                //     System.out.println(tempArray[k]);
                // }
                Arrays.sort(tempArray);
                
                int median = 0;
                if((tempArray.length)%2==0)  {
                    median = (tempArray[d/2]+tempArray[(d/2)-1])/2;
                }
                else {
                    median = tempArray[d/2] ;
                }
                System.out.println(tempArray[d/2]);
                System.out.println(median+" and  "+temp);
                if(temp>=(2*median)) {
                    result++;
                }
                dcounter++;
            }
            return result;
    }

    

    public static void main(String[] args) throws IOException {
        
        int d = 4;

        int[] expenditure = {1,2,3,4,4};

       
        int result = activityNotifications(expenditure, d);

        System.out.println(result);
    }
}

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class GradingStudent {

    /*
     * Complete the gradingStudents function below.
     */
    static int[] gradingStudents(int[] grades) {
        

        int result[]=null;
        if(grades.length>0) {
            result = new int[grades.length];
            for(int i = 0;i<grades.length;i++) {
                if(grades[i]<38) {
                    result[i] = grades[i];
                }
                else {
                    int temp = grades[i]%5;
                    if(temp>=3 && temp<5) {
                        result[i] = grades[i] + (5 - temp);
                    }
                    else {
                        result[i] = grades[i];
                    }
                }
            }
        }
        return result;
    }

    

    public static void main(String[] args) throws IOException {
        

        int[] grades = {44,84,94,21,0,18,100,18,62,30};
        

        int[] result = gradingStudents(grades);
        for(int i = 0; i<result.length;i++) {
            System.out.println(result[i]);
        }
    }
}

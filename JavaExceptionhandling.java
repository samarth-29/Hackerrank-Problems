import java.io.*;
import java.util.*;

public class JavaExceptionHandling {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        try{
        try{
            int x = new Integer(scan.nextInt());
            int y = new Integer(scan.nextInt());
            System.out.println(""+(x/y));
        }catch (InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
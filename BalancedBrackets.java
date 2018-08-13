import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BalancedBrackets {

    // Complete the isBalanced function below.
    static String isBalanced(String s) {

            String result = "YES";
            int top = -1;
            char stack[] = null;
            if(s.length()> 0 && s.length()%2==0) {
                stack = new char[s.length()];
                for(int i =0; i<s.length();i++) {
                    //System.out.println(s.charAt(i) +"::: "+top);
                    if(s.charAt(i) == '{') {
                        top++;
                        stack[top] = s.charAt(i);
                        //System.out.println(top+" curley add"+"  ::: "+stack[top]);
                    }
                    else if(s.charAt(i) == '(') {
                        top++;

                        stack[top] = s.charAt(i);
                        ///System.out.println(top +" round add"+"  ::: "+stack[top]);
                    }
                    else if(s.charAt(i) == '[') {
                        top++;
                        
                        stack[top] = s.charAt(i);
                        ///System.out.println(top +" sqaure add"+"  ::: "+stack[top]);
                    }
                    else if(s.charAt(i) == ']') {
                        if(stack[top] == '[') {
                            top--;
                            //System.out.println(top+" sqaure pop"+"  ::: "+stack[top]);
                            continue;
                        }
                        else {
                            result = "NO";
                            break;
                        }
                    }
                    else if(s.charAt(i) == ')') {
                        if(stack[top] == '(') {
                            top--;
                            //System.out.println(top+ " round pop"+"  ::: "+stack[top]);
                            continue;
                        }
                        else {
                            result = "NO";
                            break;
                        }
                    }
                    else if(s.charAt(i) == '}') {
                        if(stack[top] == '{') {
                            top--;
                           // System.out.println(top +" curley pop"+"  ::: "+stack[top]);
                            continue;
                        }
                        else {
                            result = "NO";
                            break;
                        }
                    }
                    
                    // else {
                    //     result = "NO";
                    //     break;
                    // }
                }
                //System.out.println(top +" outside");
                if(top == -1) {
                    result = "YES";
                }
            }
            else {
                result = "NO";
            }
            return result;
    }

    

    public static void main(String[] args) throws IOException {
    
            

            String result = isBalanced("{(([])[])[]}");
            //String result = isBalanced("{[()]}");
            System.out.println(result);
    }
}

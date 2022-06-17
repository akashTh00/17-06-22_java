// Java Substring Hackerank Solution
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        char[] ch = new char[S.length()];
  
        
        for (int i = 0; i < S.length(); i++) {
            ch[i] = S.charAt(i);
        }
        for(int i=start;i<end;i++){
            System.out.print(ch[i]);
        }
    }
}
//Java Substring Hackerank Solution
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = Integer.parseInt(s,2);
        if(n>=65 && n<=90)
            System.out.println((char)n);
        else
            System.out.println("INVALID PAPER CODE");

    }
}

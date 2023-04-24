import java.io.*;
import java.util.*;
import java.math.RoundingMode;  
import java.text.DecimalFormat;  


public class Solution {
    private static final DecimalFormat df = new DecimalFormat("0.0");  
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        float a,b,c;
        Scanner in = new Scanner(System.in);
        a = in.nextFloat();
        b = in.nextFloat();
        c = in.nextFloat();
        float avg = (a+b+c)/3;
        df.setRoundingMode(RoundingMode.DOWN);  
        System.out.println(df.format(avg));
    }
}

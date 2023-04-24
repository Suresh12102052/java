import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner ob=new Scanner(System.in);
        int a=ob.nextInt();
        Double d=new Double(a);
        if(d!=0 && d>=5)
           System.out.println(d);
        else
            System.out.print("Invalid Input");
        
    }
}

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        String c= sc.next();
        String c2=sc.next();
        StringBuilder s=new StringBuilder();
       
        s.append(c2);
        
        s.reverse();
        String s1=s.toString();
        
        if(s1.compareTo(c)==0)
            System.out.println("Similar");
        else
            System.out.println("Not Similar");
    }
}

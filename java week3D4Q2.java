import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int y=t+(int)(t*0.1);
        int x=y/12;
        System.out.println(y);
        System.out.println(x+".33");
    }
}

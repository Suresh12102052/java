import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        boolean result = check(n);
        if (result == true) {
            System.out.println("True");
        } else if (result == false) {
            System.out.println("False");
        }
    }
    
    public static boolean check(int n) {
        if (n < 10 && n > 500) {
            System.out.println("Invalid Input");
            return false;
        } else if (n % 2 == 0 && n % 13 == 0) {
            return true ;
        } else {
            return false;
        }
    }
}

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=a;i>0;i--){
            for(int j=1;j<=i;j++){
              System.out.print(j+" ");
        }
            System.out.println();
        }
    }
}

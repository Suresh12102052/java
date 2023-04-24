import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int id=in.nextInt();
        String name=in.nextLine();
        String designation=in.nextLine();
        if(id<201)
        {
            System.out.print("No Appraisal");
        }
        else
        {
            System.out.print("Appraisal");
        }
    }
}

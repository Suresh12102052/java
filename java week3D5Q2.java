import java.io.*;
import java.util.*;

public class Main {

   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        if(s>0&&s<100)
        {
            for(int i=0;i<=s;i++){
                System.out.println(i);
            }
            System.out.println("Games End");    
        
        }
                
          
    else{
            System.out.println("Invalid Input");
     }
   }
}

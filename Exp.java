import java.util.Scanner;
class Exp
{	
 public static void main(String[]args)
 {
 Scanner st=new Scanner(System.in);
 String S1=st.nextLine();
 System.out.println("enter S1");
 String replaceString=S1.replace("is","was");
  //String replaceString=S1.replace("are","were");
  System.out.println(replaceString);
  }
  }
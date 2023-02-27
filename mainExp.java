import java.util.Scanner;
class mainExp
{	
 public static void main(String[]args)
 {
 Scanner st=new Scanner(System.in);
 System.out.println("enter S1");
 String S1=st.nextLine();
 String replaceString=" ";
if(S1.contains("is")) 
{
  replaceString=S1.replace("is","was");
 }
  //String
else if(S1.contains("are"))
{  
 replaceString=S1.replace("are","were");
 }
  System.out.println( replaceString );
  }
  }
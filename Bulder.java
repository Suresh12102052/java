import java.util.Scanner;
class Builder
{	
 public static void main(String[]args)
{
StringBuilder S1=new StringBuilder("i am");
S1.append("suresh");
System.out.println(S1);
System.out.println(S1.capasity);
S1.insert(1,"xyz");
System.out.println(S1);
System.out.println(S1.capasity);
S1.replace( 1,2,".");
System.out.println(S1);
System.out.println(S1.capasity);
S1.delete(1,2);
System.out.println(S1);
System.out.println(S1.capasity);
S1.reverse();
System.out.println(S1);
System.out.println(S1.capasity);
}
}
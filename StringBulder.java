import java.util.Scanner;
class StringBulder
{
	
	
 public static void main(String[]args)
{
StringBulder S1=new StringBulder();
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
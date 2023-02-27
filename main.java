import java.util.Scanner;
class main
{
public static void main(String[] args)
 {
Scanner kl=new Scanner(System.in);

int  n=kl.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=kl.nextInt();
arr[i]=arr[i]*2;
System.out.println(i);
}
 }
}
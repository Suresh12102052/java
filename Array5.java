import java.util.Scanner;
class Array5
{
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);int s1=sc.nextInt();
        int s2=sc.nextInt();
        int s3=sc.nextInt();
        int s4=sc.nextInt();
        int s5=sc.nextInt();
        //int sum=(s1+s2+s3+s4+s5)/500)*100);
		 //int s1=sc.nextInt();
        //int s2=sc.nextInt();
        //int s3=sc.nextInt();
        //int s4=sc.nextInt();
        //int s5=sc.nextInt();
        int scored=(s1+s2+s3+s4+s5);
        int total_marks=500;
         int per= (int)((scored / 500) * 100);
		System.out.println(per);
		}
		}
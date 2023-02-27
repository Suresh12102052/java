import java.util.Scanner;
class Array4
{
public static void main(String[]args)
{
	Scanner st=new Scanner(System.in);
	 System.out.print("enter fed: ");
	int fed=st.nextInt();
	int[]num=new int[fed];
	num[0]=0;
	num[1]=1;
	for(int i=2;i<fed;i++)
	{
	num[i]=num[i -1]+num[i - 2];

	}
	System.out.println("fabonicciserice");
	for(int i=0;i< fed;i++)
	{
		System.out.println(num[i] + " ");
	}
	
	}
	}
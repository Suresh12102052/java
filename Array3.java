import java.util.Scanner;
class Array3
{
public static void main(String[]args)
{
	Scanner st=new Scanner(System.in);
		System.out.println("enter n ");
	int n=st.nextInt();
	int fac=1;
	//System.out.println("enter n ");
	for(int i=1;i<=n;i++)
	{
		  fac=fac*i;
	//System.out.println(result);
	}
	System.out.println(fac);
	}
}

	
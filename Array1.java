import java.util.Scanner;
class Array1
{
public static void main(String[]args)
{
	Scanner st=new Scanner(System.in);
	int n=st.nextInt();
	int m=st.nextInt();
	int num[][]=new int [n][m];
	for(int i=0;i<20;i++)
	{
	for(int j=0;j<30;j++)
	{
	System.out.print(num[i][j]+" ");
	}
	System.out.println();
	}
	}
	}
import java.util.Scanner;
class atm
{
  public static void main(String[] args)
  {
   Scanner kl=new Scanner(System.in);
   System.out.println("select the option on displaied on screen ");
   System.out.println("1.withdraw \n 2.deposith\n 3.balance_cheking\n ");
   int num=kl.nextInt();// to select the options
   int x=1;                                   //---------->x=1  for withdraw the money
   //System.out.println("")
   int y=2;                                 //-----------> y=2  for  deposith the money 
   int z=3;                                //------------> z=3  for  check the money
   int total_money=2000;

   if(num==x)                  //withdraw the money
    {
	   System.out.println("enter amount:  ");
       int a=kl.nextInt();
	   int c=total_money-a;
	   System.out.println(" successfully withdrawal the money" );
	    total_money=c;
	   System.out.println("total amount "+total_money);
    }
	if(num==y)
	{
		System.out.println("enter amount to deposith:");
		int d=kl.nextInt();
		int dt=total_money+d;
		System.out.println("successfully deposith the money "+dt);
		total_money=dt;
		System.out.println("total amount after deposith of money :-"+total_money);
	}

	if(num==z)
	{
		System.out.println("total amount "+total_money);
	}
  }
}
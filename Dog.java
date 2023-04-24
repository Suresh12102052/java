interface one
{
	void dogname(String S);
	void dogage(int x);
	void dogcol(String S);
	void dogspeed(int x);
}
class dogdetails implements one
{
public void dogname(String S)
{
	System.out.println(S);
}
public void dogage(int x)
{
	System.out.println(x);
}
public void dogcol(String S)
{
	System.out.println(S);
}
public void dogspeed(int x)
{
	System.out.println(x);
}
}
class Dog
{
	public static void main(String[]args)
	{
		dogdetails d1=new dogdetails();
		d1.dogname("puppy");
		d1.dogage(10);
		d1.dogcol("black");
		d1.dogspeed(50);
	}
}
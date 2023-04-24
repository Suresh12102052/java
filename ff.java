class student
{
	void name(String s);
	void rollno(int x);
	void regnum(int x);
	void cgpa(double x);
}
class suresh extends student
{
	public void name(String s)
	{
		System.out.println(s);
	}
		public void rollno(int x)
	{
		System.out.println(x);
	}
		public void regnum(int x)
	{
		System.out.println(x);
	}
		public void cgpa(double x)
	{
		System.out.println(x);
	}
}
class bala extends student
{
	public void name(String s)
	{
		System.out.println(s);
	}
		public void rollno(int x)
	{
		System.out.println(x);
	}
		public void regnum(int x)
	{
		System.out.println(x);
	}
		public void cgpa(double x)
	{
		System.out.println(x);
	}
}
class st
{
	public static void main(String[]args)
	{
	    System.out.println("bala details");
		bala b1=new bala();
		b1.name("bala");
		b1.rollno(2);
		b1.regnum(12102055);
		b1.cgpa(9.8);
		System.out.println("suresh details");
		suresh s1=new suresh();
		s1.name("Suresh");
		s1.rollno(3);
		s1.regnum(12102052);
		s1.cgpa(7.57);
	}
}
/*interface A
{
	void age(int x);
	void  name(String s);
	void regno(int r);
	
}
class B implements A
{
	public void age(int x)
	{
		System.out.println("your age is= " +x);
	}
		public void name(String s)
	{
		System.out.println("your name is = " +s);
	}
		public void regno(int r)
	{
		System.out.println( "your nmae is ="+r);
	}
	public void jathi(String st)
	{
		System.out.println(st);
	}
	
}

class c extends B implements A
{
		public void age(int x)
	{
		System.out.println("your age is= " +x);
	}
	public void name(String s)
	{
		System.out.println("your name is = " +s);
	}
	public void regno(int r)
	{
		System.out.println( "your nmae is ="+r);
	}
	
}
class ccc
{
	public static void main(String[]args)
	{
		B obj=new B();
		obj.age(21);
		obj.name("suresh");
		obj.regno(1210001);
		System.out.println("details of c");
		c obj1=new c();
		obj1.name("dddddd");
		obj1.age(22);
		obj1.regno(1200020);
		obj1.jathi("dog");
		
		
	}
}

class ccc {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        try {
            j = 18 / i;
        } catch (ArithmeticException e) {
            System.out.println("something went wrong: " + e);
        }
        System.out.println(j);
        System.out.println("bye");
    }
}
///////


class ccc
{
	public static void main(String[]args)
	{
	int s=2;
	int j=0;
	int arr[]=new int[5];
	try{
		j=18/s;
		
		System.out.println(arr[1]);
		System.out.println(arr[5]);
		
	}
	catch(ArithmeticException  e)
	{
		System.out.println("something went wrong" +e);
	}
	catch(Exception  e)
	{
	System.out.println("out of bound");
	}
	System.out.println(j);
	System.out.println("bye");
	}
}*/

	//// two num///
import java .util.Scanner;
	class ccc
	{
		public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			try
			{
				int c=a/b;
			}
			catch(ArithmeticException e)
			{
				System.out.println("some thing went wrong");
			}
			catch(NumberFormatException e)
			{
				System.out.println("some thing went wrong");
			}
			System.out.println(b);
			System.out.println("bye have a nice day");
			}
	}
				
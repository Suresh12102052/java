class ppp
{
	int counter
	public synchronized void invrement()
	{
		count++;
	}
}
class count
{
	public static void main(String[]args)
	{
		counter c=new counter();
		Runnable obj1=()->
		{
			for(int i=1;i<=1000;i++)
			{
				c.increment();
			}
		};
		Runnable obj2=()->
		{
			for(int i=1;i<=1000;i++)
			{
				c.increment();
			}
		};
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	}
}
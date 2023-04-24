class dog 
{
	String name;
	public void name(String name)
	{
		System.out.println(name);
	}
	String col;
	
		public void col(String col)
		{
			System.out.println(col);
		}
}
class dogdetails extends dog
{
	int speed;
	//int age;
   public void speed(int speed)
	{
		System.out.println(speed);
	}
	int age;
	public void age(int age)
	{
		System.out.println(age);
		
	}
}

class ddd
{
	public static void main(String[]args)
	{
		dogdetails d1=new dogdetails();
		d1.name("puppy");
		d1.col("black");
		d1.speed(100);
		d1.age(12);
	}
}

	